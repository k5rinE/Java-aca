package ex;

import java.util.*;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int tmp = 0;
		
	
		for(int i=0; i<999999999; i++) {
			   System.out.print("입력 ㄱ");
	           tmp = sc.nextInt();
	           

		if(max<tmp) {
			max=tmp;
		}		
		System.out.println("제일큰수"+ max);
	       }
	          

}}