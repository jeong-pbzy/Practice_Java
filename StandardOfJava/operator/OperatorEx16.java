package operator;

public class OperatorEx16 {

	public static void main(String[] args) {
		char x = 'j';
		if((x>='a' && x<='z') || (x>='A' && x<='z')) {
			System.out.println("유효한 문자 입니다.");
		} else {
			System.out.println("유효하지 않은 문자입니다.");
		}

	}

}
