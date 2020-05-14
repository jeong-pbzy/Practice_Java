package operator;

public class OperatorEx13 {

	public static void main(String[] args) {
		int share = 10 / 8;
		int remain = 10 % 8;
		System.out.println("10을 8로 나누면, ");
		System.out.println("몫은 "+share+"이고, 나머지는 "+remain+"입니다");
		
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
