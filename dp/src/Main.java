import java.util.Scanner;

/**
 * 	简单工厂模式
 * 	Operation 父类， 含有两个运算数， 和一个GetResult()
 *  加减乘除运算符类继承 Operation，重载GetResult
 *  
 *  工厂类 OperationFactory与Operation关联，在方法creatFactory()中根据运算符参数决定实例化哪个运算符类，并返回类
 *  在客户端中实现 Operation的实例化。
 *  
 *  注意： Java抽象类是不能实例化
 *   
 * @author nocLyt
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner cin= new Scanner(System.in);
		Operation op= new Operation();
		int numa= cin.nextInt();
		String str= cin.next();
		//System.out.println("str= "+str);
		int numb= cin.nextInt();
		
		op= OperationFactory.creatFactory(str);
		op.setNuma(numa);
		op.setNumb(numb);
		
		System.out.println("ans= "+op.GetResult());
		
	}

}

