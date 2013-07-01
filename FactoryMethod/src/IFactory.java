/**
 * 
 * 
 */

abstract class IFactory {
	public abstract Operation CreatOperation();
}

class AddFactory extends IFactory{

	@Override
	public Operation CreatOperation() {
		// TODO Auto-generated method stub
		return new AddOperation();
	}
	
}

class SubFactory extends IFactory{

	@Override
	public Operation CreatOperation() {
		// TODO Auto-generated method stub
		return new SubOperation();
	}
	
}

class MulFactory extends IFactory{

	@Override
	public Operation CreatOperation() {
		// TODO Auto-generated method stub
		return new MulOperation();
	}
	
}