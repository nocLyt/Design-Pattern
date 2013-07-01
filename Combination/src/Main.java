/***
 * Combination 组合模式
 * 
 * 什么时候使用： 
 * 		当需求中是体现部分与整体层次的结构时，以及你希望用户可以忽略组合对象于单个对象的不同， 统一地使用组合结构中的所有对象时。
 * 
 * 组合模式的目的：
 * 		让客户端不再区分操作的是组合对象还是叶子对象，而是以一种统一的方式来操作
 * 
 * 两种实现方式： 安全方式 和透明方式
 * 安全方式：树根类声明所有用来管理子类对象的方法。 
 * 				优点： 安全，保证树叶不可管理操作这些方法。
 * 				缺点： 不够透明，树叶类和 树根类将有不同的接口。 
 * 
 * 透明方式：在接口(或抽象类)里声明 所有用来管理子类的方法。
 * 				优点： 树叶类和树根类具有相同的接口
 * 				缺点： 不够安全。
 * @author lyt
 *
 */

public class Main {


	public static void main(String[] args) {
		ConcreteCompany root= new ConcreteCompany("北京总公司");
		ConcreteCompany sh= new ConcreteCompany("上海华东分公司");
		ConcreteCompany nj= new ConcreteCompany("南京办事处");
		ConcreteCompany hz= new ConcreteCompany("杭州办事处");
		
		root.Add(new HRDepartment("总公司人力资源部"));
		root.Add(new FinanceDepartment("总公司财务部"));
		sh.Add(new HRDepartment("华东分公司人力资源部"));
		sh.Add(new FinanceDepartment("华东分公司财务部"));
		nj.Add(new HRDepartment("南京人力资源部"));
		nj.Add(new FinanceDepartment("杭州财务部"));
		hz.Add(new HRDepartment("杭州人力资源部"));
		hz.Add(new FinanceDepartment("南京财务部"));
		
		root.Add(sh);
		sh.Add(nj);
		sh.Add(hz);
		
		System.out.println("结构图： ");
		root.Display(1);
		System.out.println("-------------------------");
		System.out.println("职责： ");
		root.LineOfDuty();
		
	}

}
