/**
 * 角色状态管理类
 * 
 * 在角色状态管理类中不提供修改，查询状态的功能。
 * 
 * @author lyt
 *
 */
public class GameRoleCaretaker {
	private GameRoleState sta;

	// 显示状态    修改状态 debug用
	void Show(){
		sta.Show();
	}
	
	public GameRoleState getSta() {
		return sta;
	}
	public void setSta(GameRoleState sta) {	//保存备忘录
		this.sta = new GameRoleState(sta);
	}
	
}
