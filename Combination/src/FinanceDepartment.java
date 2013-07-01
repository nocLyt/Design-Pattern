// FinanceDepartment 继承 Company
public class FinanceDepartment extends Company{

	public FinanceDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Add(Company c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Remove(Company c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Display(int depth) {
		// TODO Auto-generated method stub
		System.out.println( cal_tab(depth,"-")+name );
	}

	@Override
	public void LineOfDuty() {
		// TODO Auto-generated method stub
		System.out.println(name+" 公司收支管理");
	}
	
}
