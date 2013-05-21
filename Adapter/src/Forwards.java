
public class Forwards extends Player {
	public Forwards(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("Forwards\t"+name+"\tAttack");
	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		System.out.println("Forwards\t"+name+"\tDefense");
	}
}
