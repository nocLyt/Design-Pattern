/**
 * 工厂方法模式
 * 定义了用于创建对象的接口(IFactory), 让子类去决定实例化哪个类。
 * 使类的实例化延迟到子类
 * 
 * @author lyt
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFactory ifactory= new AddFactory();
		Operation op= ifactory.CreatOperation();
		op.setNumA(1.0);
		op.setNumB(2.0);
		System.out.println( op.cal());
		
	}

}
