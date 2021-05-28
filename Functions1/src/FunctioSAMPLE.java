import java.util.Scanner;

public class FunctioSAMPLE {
	
	public static void main(String ar[]) {
		Scanner s=new Scanner(System.in);
		
		FunctionHello obj1=new FunctionHello();
		FunctionHello obj2=new FunctionHello();
		
		
		System.out.println("Enter 2 Numbers");
		
		int num1=s.nextInt();
		int num2=s.nextInt();
	
		obj1.sum(num1,num2);
		obj1.display();
		
		
		
System.out.println("Enter 2 Numbers");
		
		int num3=s.nextInt();
		int num4=s.nextInt();
	
		obj1.sum(num3,num4);
		obj1.display();
		
		
		
		
	}

}
