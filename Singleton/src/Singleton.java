/**
 * 懒汉模式
 * @author lyt
 *
 */
public class Singleton {
	private static Singleton single;
	private Singleton(){
	}
	public static Singleton GetInstance(){
		if(single==null)
			single= new Singleton();
	
		return single;
	}
	public void pf(){
		System.out.println("You Got it!");
	}
}
