import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {  //å37������
		
		// �̸�, ���� ��� �Ѵ�.
		
		/*int age = 20;
		String name = "ȫ�浿";
		
		System.out.printf("name : %s, age : %d\n", name, age);
		System.out.println("name : " + name + ", age : " + age);
		*/
		
		int age = 20;   //��� ĭ���ٰ� Ŀ�� ���� ���̸� �Է��ϸ� ��´�
		String name;
		
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		
		System.out.printf("name : %s, age : %d\n", name, age);
		System.out.println("name : " + name + ", age : " + age);
		
	}

}
