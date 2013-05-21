/**
 * 游戏角色状态类 
 * hp, mp, exp, lvl  血量 蓝量 经验 级别
 * atk, def;	攻击力 防御力
 * 
 * 方法: 
 * Show() 显示状态
 * @author lyt
 *
 */
public class GameRoleState {
	private int hp, mp, exp, lvl;
	private int atk, def;
	
	//无参构造函数
	public GameRoleState(){
		hp= mp= atk= def= lvl= 1;
		exp= 0;
	}
	
	// 复制构造函数
	public GameRoleState(GameRoleState sta0) {
		super();
		this.hp = sta0.hp;
		this.mp = sta0.mp;
		this.exp = sta0.exp;
		this.lvl = sta0.lvl;
		this.atk = sta0.atk;
		this.def = sta0.def;
	}
	
	// 参数构造函数
	public GameRoleState(int hp, int mp, int exp, int lvl, int atk, int def) {
		super();
		this.hp = hp;
		this.mp = mp;
		this.exp = exp;
		this.lvl = lvl;
		this.atk = atk;
		this.def = def;
	}
	
	// 显示
	public void Show(){
		System.out.println("hp= "+hp+"  mp= "+mp+"  lvl= "+lvl);
	}
	//---------------------------
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	
}
