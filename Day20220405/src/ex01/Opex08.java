package ex01;

import java.util.Scanner; //���â���� �Է��ؾ� ����

public class Opex08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// ���� 'a' : ���ڿ� : "korea"
		char ch = ' ';
		
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���.>"); //
		
		String input = scanner.nextLine();
		ch = input.charAt(0);        			//�Ƶ� ���� �ټ�
		
		if('0'<=ch && ch <='9') { // 0~9��  �ؿ� ���� ������
			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�.%n");
		}
		
		if(('a'<= ch && ch<='z')||('A'<=ch && ch <='Z')) { //�ҹ��� �� �빮�� ���߾ƹ��ų� ���� �ؿ����� ���
			System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�. %n");
		}
		
	}
}
