package OperatePractice;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {

		System.out.println("���� ���� �Է��ϼ���.>");
		
		Scanner sc = new Scanner(System.in); //-- ��Ʈ
		int month = sc.nextInt(); 
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("������ ������ ���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("������ ������ �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("������ ������ �����Դϴ�.");
			break;
			
			//default:  //34567891011 ������ �����ڴ� �ܿ�� ���            
		//case 12:
		//case 1:
		//case 2:
		case 12, 1, 2:
			System.out.println("������ ������ �ܿ��Դϴ�.");
			//34567891011 ������ �����ڴ� �ܿ�� ���
		break;
			default:  //13�̻� ����ġ�� ���Ҹ��� �ν�
				System.out.println("��������� �Դ�?");
		}
		
		

	}

}
