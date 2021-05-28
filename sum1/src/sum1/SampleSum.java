package sum1;

import java.util.Scanner;

public class SampleSum {
	public static void main(String ar[]) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		
		int num=s.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum=sum+i;
		}
		
		System.out.println("Result is:"+sum);
		
		
	
	}

	

}
