package variable;

public class CharToCode {

	public static void main(String[] args) {
		
		char ch = 'A'; //char ch= '\u0041'; 
		int code = (int)ch;
		
		System.out.println(ch);
		System.out.println(code);
		
		int code1 = 65; // int code = 0x0041;
		char ch1 = (char)code1;
		
		System.out.println(code1);
		System.out.println(ch1);

	}

}
