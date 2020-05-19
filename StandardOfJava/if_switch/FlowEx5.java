package if_switch;

public class FlowEx5 {

	public static void main(String[] args) {
		int score = (int)(Math.random()*10) +1;
		String msg ="";
		
		score *= 100; //score = score * 100;
		msg = "당신의 점수는"+score+"이고, 상품은";
		
		switch (score) {
			case 1000 :
				msg += "자전거, "; // msg = msg + "자전거, ";
			case 900 :
				msg += "스마트폰, "; 
			case 800 :
				msg += "노트북, "; 
			case 700 :
				msg += "자동차, "; 
				
			default : 
				msg += "볼펜";
		}
			System.out.println( msg + "입니다.");

	}

}
