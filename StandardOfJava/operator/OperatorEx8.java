package operator;

public class OperatorEx8 {

	public static void main(String[] args) {
		byte a =10;
		byte b =20;
		byte c = (byte)(a + b) ;
		System.out.println(c);
		
		byte d = 10;
		byte e = 30;
		byte f =(byte)(d*e);
		System.out.println(f); //300이 byte의 값 범위를 넘어서므로 값손실이 일어남.

	}

}
