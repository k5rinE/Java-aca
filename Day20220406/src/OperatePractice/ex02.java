package OperatePractice;

 import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		// Ű����� �� ������ �Է� �޾Ƽ� , ������ ����� ���Ѵ�
		
		System.out.println("������ �Է��ϼ���");
		
		Scanner sc = new Scanner(System.in); //�ù� ���ܿ�
		
		String n1 = sc.nextLine();  // ���â�� ���� �����Ŵ� �� �̷� ��ɾ�
		String n2 = sc.nextLine();
		
		int num1 = Integer.parseInt(n1); // ���� �����ɷ� ���ҰŴ�
		int num2 = Integer.parseInt(n2);
		
		int sum = num1 + num2; // ���� �����͸� �̷��� �����Ұ��̴�.
		double aver = sum / 2.0; //�Ҽ��� �������� ������ int ���� ������ ����
		
		System.out.println("�հ� :" + sum+"��� :" + aver);
		// �հ� : ��µ� ����� �ִ� ���
		
		//https://where-i-am.tistory.com/entry/JAVA-�⺻-�Է�-Scanner 
		//�����ϴ»���Ʈ
	}

}
