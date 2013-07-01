
public abstract class State {
	abstract void Handle(int cur);
}

class BaiTian extends State{

	void Handle(int cur) {
		// TODO Auto-generated method stub
		if(cur>=6 && cur<=20){
			System.out.println("白天");
		}else {
			(new WanShang()).Handle(cur);
		}
	}
	
}

class WanShang extends State{
	void Handle(int cur){
		if(cur>20 || cur<6){
			System.out.println("晚上");
		}else {
			(new BaiTian()).Handle(cur);
		}
	}
}