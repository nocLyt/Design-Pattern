import java.util.Scanner;

/**
 * 	�򵥹���ģʽ
 * 	Operation ���࣬ ���������������� ��һ��GetResult()
 *  �Ӽ��˳��������̳� Operation������GetResult
 *  
 *  ������ OperationFactory��Operation�������ڷ���creatFactory()�и����������������ʵ�����ĸ�������࣬��������
 *  �ڿͻ�����ʵ�� Operation��ʵ������
 *  
 *  ע�⣺ Java�������ǲ���ʵ����
 *   
 * @author nocLyt
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner cin= new Scanner(System.in);
		Operation op= new Operation();
		int numa= cin.nextInt();
		String str= cin.next();
		//System.out.println("str= "+str);
		int numb= cin.nextInt();
		
		op= OperationFactory.creatFactory(str);
		op.setNuma(numa);
		op.setNumb(numb);
		
		System.out.println("ans= "+op.GetResult());
		
	}

}

