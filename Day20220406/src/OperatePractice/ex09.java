package OperatePractice;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		
		System.out.println("������ �Է����ּ���.>");
	
		Scanner sc = new Scanner(System.in); //-- ��Ʈ
		String tmp = sc.nextLine(); 
		int num = Integer.parseInt(tmp);
		
		switch(num) {
		case 1: 
			System.out.println("1�Է�");      // break �����ٸ� 1�ǰ��϶� 234 �׿��Է±��� �� �Էµ�
			break;
		case 2: 
			System.out.println("2�Է�");
			break;
		case 3: 
			System.out.println("3�Է�");		//break ���ٸ� 34�׿��Է´� break�� Ż����Ѿ� �ݺ��� ����
			break;
		case 4: 
			System.out.println("4�Է�");
			break;                               
			default:
			System.out.println("�� �� �Է�");  //�� �������ٰ� break ���� Ż���Ѵٴ� �� ���
		}
	}
	

}
