import java.util.Scanner;

/**
 * 
 * 策略模式： 
 * 	算法抽象类 CashSuper,各种算法类继承CashSuper(),并实现CashSuper下面的算法方法.
 * 	Context环境类 聚合 CashSuper， 在构造方法中实例化CashSuper。（注意： 通过应用简单工厂模式，我们把判断算法从客户端放到Context的构造方法中）
 * 	这样的话，客户端只需认识到Context()类，实现了收费算法和客户端的分离。
 *   
 * 就以超市收费来实现吧： 正常收费、 打八折、 满500返一百。
 *   
 * @author nocLyt
 *
 */


public class Main {

	public static void main(String[] args) {
		
		Scanner cin= new Scanner(System.in);
		String str= cin.next();		// 策略
		double tot= cin.nextDouble();	// 价格总数
		Context con= new Context(str);	
		System.out.println(con.GetResult(tot));
		
	}

}
