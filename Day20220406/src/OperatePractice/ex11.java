package OperatePractice;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
System.out.println("�����Է� ��");
		int point = 0;
		Scanner sc = new Scanner(System.in); //ȭ���� ���� �Է¹��� ������ tmp�� ����
		point = sc.nextInt();  //�Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
		
		//90A 80B 70C 60D F
		
		switch(point/10) {    //������ 90�̶�� 10�� ������ ������ �ش�Ǵ� �̷������� �ذᰡ��
		case 9 :{
			System.out.println("A");}
		break;
		case 8 :{
			System.out.println("B");}
		break;
		case 7 :{
			System.out.println("C");}
		break;                              //76���̶�� Ż���Ŵ
		case 6 :{
			System.out.println("D");}
		break;
		default:
			System.out.println("F");}
		
		}
		
	}


