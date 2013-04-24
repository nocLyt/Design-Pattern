
public class Operation{
	protected double numa, numb;
	public double getNuma() {
		return numa;
	}

	public void setNuma(double numa) {
		this.numa = numa;
	}

	public double getNumb() {
		return numb;
	}

	public void setNumb(double numb) {
		this.numb = numb;
	}
	public double GetResult(){
		double ans= 0;
		return ans;
	}
}

class OperaAdd extends Operation{
	public double GetResult(){
		return numa+numb;
	}
}

class OperaSub extends Operation{
	public double GetResult(){
		return numa-numb;
	}
}
class OperaMul extends Operation{
	public double GetResult(){
		return numa*numb;
	}
}

class OperaDiv extends Operation{
	public double GetResult(){
		return numa/numb;
	}
}

class OperationFactory{
	public static Operation creatFactory(String str){
		Operation op= null;
		if(str.equals("+"))
			op= new OperaAdd();
		else if(str.equals("-"))
			op= new OperaSub();
		else if(str.equals("*"))
			op= new OperaMul();
		else 
			op= new OperaDiv();
		return op;
	}
}


