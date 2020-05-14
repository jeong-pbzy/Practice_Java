package operator;

public class OperatorEx12 {

	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortPi = (int)(pi * 1000) / 1000f;
		float shortPi1 = Math.round(pi*1000)/1000f;
		
		System.out.println(shortPi);
		System.out.println(shortPi1);
		

	}

}
