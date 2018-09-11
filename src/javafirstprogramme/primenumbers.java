package javafirstprogramme;

import java.util.Scanner;

public class primenumbers {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter Any Number =======");
		int A=obj.nextInt();
		for (int i=3;i<A/2;i++)
			
		
		
		
		{	if(A%i==0)	{
			System.out.println("given number is not a prime number");
			break;
		}
	
			if(i==A)
			
				
				
			{	
			System.out.println("given number is prime number");
			
		}
		
		}
		   }
	}


