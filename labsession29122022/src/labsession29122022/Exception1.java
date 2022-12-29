package labsession29122022;

import java.util.Scanner;
public class Exception1 {
    
	public static void main(String[] args) {
		
		System.out.println("Enter Your Age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();//close sc 
		
		if(age<18)
		{
			throw new ArithmeticException("Age is not correct ");
		}
		else
		{
			System.out.println("You are eligible to vote");
		}
	}
}
