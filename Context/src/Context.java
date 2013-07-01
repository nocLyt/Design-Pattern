class Context{
	
	CashSuper cs= null;
	public Context(String str){
		if(str.equals("return")){
			cs= new CashReturn(100,500);
		}else if(str.equals("rebate"))
			cs= new CashRebate(0.8);
		else 
			cs= new CashNormal();
	}
	public double GetResult(double tot){
		return cs.calCash(tot);
	}

}

abstract class CashSuper{
	public abstract double calCash(double tot);
}

class CashNormal extends CashSuper{
	public double calCash(double tot){
		return tot;
	}
}

class CashReturn extends CashSuper{
	private double moneyReturn= 100;
	private double limitReturn= 500;
	public CashReturn(double _mon, double _lim){
		moneyReturn = _mon;
		limitReturn = _lim;
	}
	public double calCash(double tot){

		tot-= moneyReturn*(tot/limitReturn);
		return tot;
	}
}

class CashRebate extends CashSuper{
	private double reb= 0.8;
	public CashRebate(double _reb){
		reb= _reb;
	}
	public double calCash(double tot){
		return tot*reb;
	}
}