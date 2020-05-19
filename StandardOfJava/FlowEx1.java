package if_switch;

public class FlowEx1 {

	public static void main(String[] args) {
		int visitCount = 0;
		if (visitCount <1 ) { //조건식 연산결과 = true
			System.out.println("처음 오셨군요. 방문해 주셔서 감사합니다.");
		}
		
		int visitCount1 = 5;
		if (visitCount1 <1 ) {
			System.out.println("처음 오셨군요. 방문해 주셔서 감사합니다.");
		}else { 
			System.out.println("다시 방문해 주셔서 감사합니다.");
		}
		System.out.println("방문횟수는" + ++visitCount1 + "번 입니다.");
		
		int score = 45;
		char grade = ' ';
		if (score >=90) {
			grade = 'A';
		} else if (score >=80) {
			grade = 'B';
		} else {
			grade = 'c';
		}
		System.out.println("당신의 학점은"+ grade + "입니다.");
		
		
		int score1 = 45;
		char grade1 = ' ';
		grade1 = (score1 >=90) ? 'A' : ((score1 >=80)? 'B' : 'C');
		
		System.out.println("당신의 학점은"+grade1+"입니다.");
		}
		}
		

