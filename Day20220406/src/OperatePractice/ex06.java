package OperatePractice;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) { 
		// ���� �Է¹޾Ƽ� 90�̻�A 80B 70C 60D 60����F
		
		Scanner sc = new Scanner(System.in); //-- ��Ʈ
		
		int num = sc.nextInt();              //--
		
		if(num >= 90 && num <=100)                   //; �Ⱥ��δ� ����?
		System.out.println("A");        // ������ 100���̴� ��� üũ�� �������
		
		else if(num >= 80)
		System.out.println("B");
		
		else if(num >= 70)
		System.out.println("C");
		
		else if(num >= 60)                                                   
		System.out.println("D");
		
		else
		System.out.println("F");
		
	}

}
