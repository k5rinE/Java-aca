package OperatePractice;

public class ex01 {

	public static void main(String[] args) {
		
		int num = 4000; //4000�� -->�� �� ��
		
		int h = num/3600;
		int m = (num/60)-60;
		int s = num - (h*3600) - (m*60);
		
	
		System.out.println(h + "��" + m + "��" + s + "��");

		int bb = num%7;   //% �����ϰ� ���� �������� ǥ��
		
		System.out.println(bb);
		System.out.println("-----------------------------------------");
		System.out.println("���� �����");
		
		
				
	}

}
