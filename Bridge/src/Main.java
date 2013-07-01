
/**
 * 桥接模式
 * 
 * GOF： 将抽象部分与它的实现部分分离， 使它们都可以独立的变化。
 * 抽象化， 实现化， 脱耦。
 * 
 * 实例： 各种车在各种道路上行驶
 * 		车： 小汽车， 自行车。
 * 		路： 高速公路， 公路。
 * 
 * 实现： 
 * 		我们把 路设为实现部分， 把车设为抽象部分。
 * 		抽象类 Walker, 被 Bike, Car继承。
 * 		实现类 Road， 被 HighWay, NormalRoad继承
 * 
 * 拓展： 
 * 		如果我们还想增加一个 大卡车类， 直接扩展抽象部分即可。
 * 	
 * 缺点： 
 * 		如果不 setRoad() 设置抽象类中聚合的实现类，会造成空指针异常。
 * 
 * @author lyt
 *
 */

public class Main {


	public static void main(String[] args) {
		Walker wk= new Car();
		wk.setRoad(new HighWay());
		wk.Run();
		wk.setRoad(new NormalRoad());
		wk.Run();
		
		wk= new  Bike();
		wk.setRoad(new HighWay());
		wk.Run();
		wk.setRoad(new NormalRoad());
		wk.Run();
		
		
	}

}
