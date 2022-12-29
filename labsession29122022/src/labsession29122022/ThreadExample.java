package labsession29122022;

import java.util.Scanner;
public class ThreadExample {
    
	public void run() {
		
		System.out.println("Enter a number to check if the number is odd or even");
		Scanner sc  = new Scanner(System.in); 
    	int UserInput = sc.nextInt(); 
    	sc.close();
    	
    	if((UserInput%2)!=0)
    	{
    	  System.out.print("the given number is odd");	
    	}
    	else
    	{
    		System.out.print("the given number is even");
    	}
	}
     public static void main(String args[])
     {

     }
}
