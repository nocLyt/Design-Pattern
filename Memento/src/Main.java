/**
 *  GameRole	游戏角色类	（角色类）
 *  GameRoleState	游戏角色状态类 (备忘录）
 *  GameRoleCaretaker	游戏角色管理类 （管理类）
 *  
 *  角色类 负责创建一个备忘录，用于记录当时它的内部状态。 他可以决定备忘录储存他的哪些内部状态
 *  备忘录负责储存角色类的内部状态，防止其他类看到里面内容。 它有两个接口，管理类只能看到窄接口，只能传递其他对象。 角色类允许它访问所有数据。
 *  管理类， 负责保存好备忘录
 *  
 *  Caretaker类负责 储存备忘录。
 * 
 * @author lyt
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		GameRole lyt= new GameRole();
		GameRoleCaretaker box= new GameRoleCaretaker();
	
		lyt.Show();	lyt.Showss();
		box.setSta(lyt.getSta());
		
		System.out.println("lyt更改 hp= 100-------");
		lyt.ChangeHp(100);
		lyt.Show();
		box.Show();
		System.out.println("恢复 -------");
		lyt.RenewMemento(box.getSta());
		lyt.Show(); 
		box.Show(); 
		System.out.println("box更改 mp= 100-------");
		lyt.Show();
		box.Show();	

	}

}
