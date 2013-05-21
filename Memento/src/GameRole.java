/**
 * 游戏角色类
 * 
 * 创建备忘录， 恢复备忘录， 显示状态。
 * @author lyt
 *
 */
public class GameRole {
	private GameRoleState sta;
	
	public GameRole(){
		sta= new GameRoleState();
	}
	// 保存状态
	public GameRoleState SaveMemento(){
		return (new GameRoleState(sta));
	}
	// 恢复状态	复制构造
	public void RenewMemento(GameRoleState sta0) {
		sta= new GameRoleState(sta0);
	}
	
	// 显示状态    修改状态 debug用
	public void Show(){
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
	//---------------
	public GameRoleState getSta() {
		return sta;
	}
	public void setSta(GameRoleState sta) {
		this.sta = new GameRoleState(sta);
	}
	
}
