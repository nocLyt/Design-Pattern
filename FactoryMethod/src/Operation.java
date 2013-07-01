
public class Operation {
	double numA, numB;
	public void setNumA(double numA) {
		this.numA = numA;
	}
	public void setNumB(double numB) {
		this.numB = numB;
	}
	Operation(){
		numA= 1; numB= 1;
	}
	double cal(){
		return 0;
	}
}

class AddOperation extends Operation{
	double cal(){
		return numA+numB;
	}
}

class SubOperation extends Operation{
	double cal(){
		return numA-numB;
	}
}

class MulOperation extends Operation{
	double cal(){
		return numA*numB;
	}
}
