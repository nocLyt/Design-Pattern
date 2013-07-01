/**
 * 定义了Proxy所代表的真是实体
 */
public class RealSubject extends Subject {

	@Override
	public void Request() {
		// TODO Auto-generated method stub
		System.out.println("RealRequest!");
	}

}
