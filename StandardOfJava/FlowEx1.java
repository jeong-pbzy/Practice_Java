package if_switch;

public class FlowEx1 {

	public static void main(String[] args) {
		int visitCount = 0;
		if (visitCount <1 ) { //���ǽ� ������ = true
			System.out.println("ó�� ���̱���. �湮�� �ּż� �����մϴ�.");
		}
		
		int visitCount1 = 5;
		if (visitCount1 <1 ) {
			System.out.println("ó�� ���̱���. �湮�� �ּż� �����մϴ�.");
		}else { 
			System.out.println("�ٽ� �湮�� �ּż� �����մϴ�.");
		}
		System.out.println("�湮Ƚ����" + ++visitCount1 + "�� �Դϴ�.");
		
		int score = 45;
		char grade = ' ';
		if (score >=90) {
			grade = 'A';
		} else if (score >=80) {
			grade = 'B';
		} else {
			grade = 'c';
		}
		System.out.println("����� ������"+ grade + "�Դϴ�.");
		
		
		int score1 = 45;
		char grade1 = ' ';
		grade1 = (score1 >=90) ? 'A' : ((score1 >=80)? 'B' : 'C');
		
		System.out.println("����� ������"+grade1+"�Դϴ�.");
		}
		}
		

