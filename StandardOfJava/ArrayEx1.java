package array;

public class ArrayEx1 {

	public static void main(String[] args) {
		int sum = 0; //������ �����ϱ� ���� ����
		float average = 0f; //����� �����ϱ� ���� ����
		
		int[] score = {100, 88, 100, 100, 90}; //�迭�� �ʱ�ȭ
		
		for (int i=0; i<score.length; i++) {
			sum += score[i];
			
		}
		
		average = sum/(float)score.length;
		
		System.out.println("���� : "+sum);
		System.out.println("��� : "+average);

	}

}
