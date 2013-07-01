import java.util.ArrayList;

//	子公司 继承 Company
public class ConcreteCompany extends Company {

	private ArrayList<Company>	son= new ArrayList<Company>();
	public ConcreteCompany(String name) {
		super(name);
	}

	@Override
	public void Add(Company c) {
		son.add(c);
	}

	public void Remove(Company c) {
		son.remove(c);
		
	}

	@Override
	public void Display(int depth) {
		String str= cal_tab(depth,"-");
		System.out.println(str+name);
		
		for(Company co : son){
			co.Display(depth+2);
		}
		
	}

	public void LineOfDuty() {
		for(Company co: son){
			co.LineOfDuty();
		}
		
	}
	
	
}
