
public class Adapter extends Player{
	ForeignCenter wjzf= new ForeignCenter();
	public Adapter(String name) {
		super(name);
		wjzf.setName(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		wjzf.Jingong();
	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		wjzf.Fangshou();
	}
	
}
