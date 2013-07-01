
public class Context {
	private State sta= new BaiTian();
	public Context(){
	}
	public void Request(int cur){
		sta.Handle(cur);
	}
	
}
