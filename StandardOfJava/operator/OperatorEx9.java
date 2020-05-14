package operator;

public class OperatorEx9 {

	public static void main(String[] args) {
		int a = 1000000;
		int b = 2000000; 
		long c = a * b;
		System.out.println(c);
		
		long a1 = 1000000 * 1000000;
		long b1 = 1000000 * 1000000L;
		System.out.println(a1);
		System.out.println(b1);
		
		int a2 = 1000000 * 1000000 / 1000000;
		int b2 = 1000000 / 1000000 * 1000000;
		System.out.println(a2);
		System.out.println(b2);
		
		char c1 = 'a'; //문자'a'의 코드값인 97 저장
		char c2 = c1; //c2에 c1 값이 저장
		char c3 =' '; //공백으로 초기화
		
		int i = c1 + 1; //'a'+1=97+1=98
		
		c3 = (char)(c1+1);
		c2++;
		c2++;
		
		System.out.println("i="+i);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
		
		char d1 = 'a';
		
		//char d2 = d1 + 1; 
		char d2='a'+1;
		System.out.println(d2);

	}

}
