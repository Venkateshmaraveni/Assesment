package com.planit.programs;

import java.util.Scanner;

public class Fibonacci {
	//to return nth fibonacci number of n
    static long nthFibonacci(int n)
    {
     long num1 = 0, num2 = 1, temp;
        if (n == 0)
            return num1;
        for (int i = 2; i <= n; i++) {
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        return num2;
    }
  
	     
    public static void findIndex(int f) 
	{
		int values[]=new int[f]; // array to store fibonacci sequence
		values[0]=0;
	     values[1]=1;
	     for(int i=2;i<f;i++)
	    	 {
	    	 values[i]=values[i-1]+values[i-2];// single traversal O(N)
	    	 }
	     
	     for(int i=0;i<f;i++)
	 	{
	 		if(values[i]>=f )
	 		{
	 			if(values[i]==f)
	 			{
	 				//finds weather f is fibonacci or not and gives index
	 				System.out.println("yes, "+f+" is a fabonacci number.");
	 				System.out.println("The index is: "+i);
	 				break;
	 			}
	 			else
	 			{
	 				//finds weather f is fibonacci or not and gives closest index
	 				System.out.println("no, "+f+" is not a fabonacci number.");
	 				System.out.println("The closest index is: "+i);
	 				break;
	 			}
	 		}
	 	}
	}
    public static void main (String[] args)
    {
    	Scanner sc= new Scanner(System.in);
		System.out.println("Enter number n to get nth fibonacci: ");
		int n=sc.nextInt();
		System.out.println("Enter number f : ");
		int f=sc.nextInt();
        System.out.println("The nth fibonacci number is " +nthFibonacci(n));
        findIndex(f);
    }


}
