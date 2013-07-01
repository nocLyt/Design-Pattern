
public abstract class Road {
	public abstract void Run();
}

class HighWay extends Road{

	@Override
	public void Run() {
		System.out.println("running on HighWay");
	}
	
}

class NormalRoad extends Road{

	@Override
	public void Run() {
		System.out.println("runing on NormalRoad");
	}
	
}
