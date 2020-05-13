package operator;

public class OperatorEx6 {

	public static void main(String[] args) {
		byte b =10;
//		byte result =~b;, ~연산의 결과는 정수형 뿐이라 int만 가능함.
		byte result =(byte)~b;
		
		System.out.println("b= "+b);
		System.out.println("~b= "+result);
		

	}

}
