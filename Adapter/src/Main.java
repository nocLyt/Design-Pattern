/**
 * 适配器模式
 * 
 * 适用于 系统的数据和行为都正确，但接口不符时，使用适配器来使控制范围之外的一个原有对象与某个接口匹配
 * 
 * 举例： 篮球进攻防守， 姚明听不懂英文，需要 Adapter翻译。
 * Player 是抽象类， 包含 Attack() 和 Defense() 抽象方法
 * Forwards Center Adapter 都继承 Player，分别实现抽象方法。 
 * Adapter 有一个 ForeignCenter成员变量。
 * Adapter在实现 Attack()和 Defense() 时分别调用 ForeignCenter的Jinggong() 和 Fangshou() 
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
		
		Player jim= new Forwards("James");
		jim.Attack();
		
		Player howard= new Center("Howard");
		howard.Defense();
		
		Player ym= new Adapter("YaoMing");
		ym.Defense();
		ym.Attack();
		
	}

}
