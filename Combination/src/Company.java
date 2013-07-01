// 抽象类 Company
public abstract class Company {
	protected String name;
	public Company(String name){
		this.name= name;
	}
	
	public abstract void Add(Company c); 		// 增加
	public abstract void Remove(Company c);		// 移除
	public abstract void Display(int depth); 	// 显示
	public abstract void LineOfDuty();			// 履行职责
	public String cal_tab(int c, String s){		// 返回一个由c个s组成的字符串
		String str= new String("");
		while(c--!=0)	str+= s;
		return str;
	}
}
