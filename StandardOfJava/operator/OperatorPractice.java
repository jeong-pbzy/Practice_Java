package operator;

public class OperatorPractice {

	public static void main(String[] args) {
		//Q1
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(1 + x <<33);
		System.out.println(y >=5 || x <0 && x >2);
		System.out.println(y +=10 - x++);
		System.out.println(x+=2);
		System.out.println(!('A'<=c && c<='Z'));
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
		
		//Q2
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket)>0?1:0);
		
		System.out.println("필요한 바구니의 수 :"+numOfBucket);
		
		//Q3
		int num = 10;
		System.out.println(num>0 ? "양수" : (num < 0? "음수" : 0));
		
		
		//Q4
		int num1 = 456;
		System.out.println((num1/100)*100);
		
		
		//Q5
		int num2 = 333;
		System.out.println(num2/10*10+1);
		
		//Q6
		int num3 = 24;
		System.out.println(10-num3%10);
		
		//Q9
		char ch = 'z';
				boolean b = ('a'<=ch && ch <= 'z')|| ('A'<= ch && ch <='Z');
		System.out.println(b);
		
		
		

	}

}
