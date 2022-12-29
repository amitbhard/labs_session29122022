package labsession29122022;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter two numbers:");
		 
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        try {
	            int result = num1 / num2;
	            System.out.println("Result = " + result);
	        } catch (Exception e) {
	            System.out.println("Exception: zero!");
	        }
	}

}
