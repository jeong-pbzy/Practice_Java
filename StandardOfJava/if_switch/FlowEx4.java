package if_switch;

public class FlowEx4 {

	public static void main(String[] args) {
		int score = 1;
		
		switch (score*100) {
			case 100 : 
				System.out.println("당신의 점수는 100이고, 상품은 자전거 입니다.");
			case 200 : 
				System.out.println("당신의 점수는 200이고, 상품은 스마트폰 입니다.");
			case 300 : 
				System.out.println("당신의 점수는 300이고, 상품은 노트북 입니다.");
			case 400 : 
				System.out.println("당신의 점수는 400이고, 상품은 자동차 입니다.");
			default : 
				System.out.println("죄송하지만 해당 상품이 없습니다.");
		}

	}

}
