/**
 * 角色状态管理类
 * 
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
	public void Showss(){
		System.out.println("->"+sta+"<-");
	}
	void ChangeHp(int x){
		sta.setHp(x);
	}
	void ChangeMp(int x){
		sta.setMp(x);
	}
	void ChangeLvl(int x){
		sta.setLvl(x);
	}
	//----------------------------
	public GameRoleState getSta() {
		return sta;
	}

	public void setSta(GameRoleState sta) {	//保存备忘录
		this.sta = new GameRoleState(sta);
	}
	
}
