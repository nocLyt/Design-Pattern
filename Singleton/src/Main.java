/**
 * 单例模式
 * 保证类只有一个实例，并且提供一个对他的全局访问点
 * 
 * 本质： 控制实例数目。
 * 
 * 实现： 类含有一个静态的私有的自身对象。私有构造方法。一个静态的全局访问方法，返回值是静态的自身对象。
 * 			通过这个对象，来调用类中的公有成员方法。
 * 
 * 懒汉模式： 在调用全局访问方法时，对自身对象实例化
 * 饿汉模式： 在创建私有的自身对象时，进行实例化。
 * 
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton sg= Singleton.GetInstance();
		sg.pf();
	}

}
