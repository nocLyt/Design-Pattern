
public abstract class Walker {
	protected Road road;
	public void setRoad(Road _r){
		road= _r;
	}
	public abstract void Run();
}

class Car extends Walker{
	public void Run(){
		System.out.print("It's Car ");
		road.Run();
	}
}

class Bike extends Walker{
	public void Run(){
		System.out.print("It's Bike ");
		road.Run();
	}
}
