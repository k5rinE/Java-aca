package ex01;

public class Opex2 {

	public static void main(String[] args) {
		float pi = 3.14159f; // 3.141
		float result = (int)(pi*1000) / 1000.0f; // int ������ ������ ��ȯ ������ ()�ȿ� pi*1000 �־ �������
		System.out.println(result);					// 3141 ����� �ٽ� õ�� ������ 3.141 �Ҽ����ڸ� ����.0f ����
		
		
		// 3.142 ��������
		float result2 = (int)(pi*1000+0.5f) / 1000.0f;  //0.5 ���Ѱ�
		
		System.out.println(result2);
	}

}
