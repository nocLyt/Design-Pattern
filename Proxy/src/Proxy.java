/**
 *  保存一个引用使得代理可以访问实体，
 *  并提供一个于Subject的接口相同的接口，这样代理就可以用来代替实体了
 * @author lyt
 *
 */
public class Proxy extends Subject {
	RealSubject realSubject;

	@Override
	public void Request() {
		// TODO Auto-generated method stub
		if(realSubject ==null){
			realSubject= new RealSubject();
		}
		System.out.println("I'm Proxy: ");
		realSubject.Request();
	}
	
}
