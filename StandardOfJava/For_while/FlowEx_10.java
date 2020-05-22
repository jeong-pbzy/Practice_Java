package for_while;

public class FlowEx_10 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if (sum > 100)
				break;
			i++;
			sum += i;
			
		}//end of while
		
		System.out.println("i="+i);
		System.out.println("sum="+ sum);
		
		
		for (int a=0; a <=10; a++) {
			if (a%3==0)
				continue;
			System.out.println(a);
		}

	}

}
