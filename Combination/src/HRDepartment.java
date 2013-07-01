// HRDepartment 继承 Company
public class HRDepartment extends Company {

	public HRDepartment(String name) {
		super(name);
	}

	@Override
	public void Add(Company c) {
		
	}

	@Override
	public void Remove(Company c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Display(int depth) {
		System.out.println(cal_tab(depth,"-")+ name);
	}

	@Override
	public void LineOfDuty() {
		System.out.println(name+"  员工招聘培训管理");
	}
	
	
}
