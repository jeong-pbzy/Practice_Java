package operator;

public class OperatorEx13 {

	public static void main(String[] args) {
		int share = 10 / 8;
		int remain = 10 % 8;
		System.out.println("10�� 8�� ������, ");
		System.out.println("���� "+share+"�̰�, �������� "+remain+"�Դϴ�");
		
		for(int i=1; i<=10; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
			

		}
		System.out.println(-10%8);
		System.out.println(10%-8);
		System.out.println(-10%-8);
	}

}
