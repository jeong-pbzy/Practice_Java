package operator;

public class OperatorEx15 {

	public static void main(String[] args) {
		if(10==10.0f) {
			System.out.println("10�� 10.0f�� ����.");
		}

		if('0'!=0) {
			System.out.println("'0'�� 0�� ���� �ʴ�.");
		}
		if('A'==65) {
			System.out.println("'A'�� 65�� ����.");
		}
		int num = 5;
		if (num>0 && num<9) {
			System.out.println("5�� 0���� ũ��, 9���� �۴�.");
		}
		
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		System.out.println("10.0==10.0f ?"+(10.0==10.0f));
		System.out.println("0.1==0.1f ?"+(0.1==0.1f));
		System.out.println("f="+f);
		System.out.println("d="+d);
		System.out.println("d2="+d2);
		System.out.println("d==f ?"+(d==f));
		System.out.println("d==d2 ?"+(d==d2));
		System.out.println("d2==f ?"+(d2==f));
	}

}
