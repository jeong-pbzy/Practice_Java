package variable;

public class ByteOverflow {

	public static void main(String[] args) {
		byte b = 0;
		int i = 0;

		//�ݺ����� �̿��� b�� ���� 1��, 0���� 270���� ������Ŵ
		for(int x=0; x<=270; x++) {
			System.out.println(b++);
			System.out.println('\t');
			System.out.println(i++);
		}
	}

}
