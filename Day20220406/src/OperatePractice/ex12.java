package OperatePractice;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		
		System.out.println("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���.>");
		
		Scanner sc = new Scanner(System.in); //ȭ���� ���� �Է¹��� ������ tmp�� ����
	    int user = sc.nextInt();  //�Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
	    int com = (int)(Math.random()*3) + 1; //1,2,3�� �ϳ��� com�� �����  ���ظ� �ϰ� �ִ��� ������
	    
	    System.out.println("�����");
	}

}
