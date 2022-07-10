package com.planit.programs;

import java.util.Scanner;

public class MaximumOccuringChar {
	public static char maxChar(String str) 
	{
		int[] array = new int[str.length()]; //initialize array with 0 with length of string
	      char maxChar = str.charAt(0);   //stores initial character of array 
	      int i, j, max;            
	      char string[] = str.toLowerCase().toCharArray();    
	      for(i = 0; i < string.length; i++) 
		  {    
	    	  array[i] = 1;    
	          for(j = i+1; j < string.length; j++) 
			  {    
	              if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') 
				  {    
	            	  array[i]++; 
	                       
	              }    
	          }    
	      }    
	      max = array[0];
	      for(i = 0; i <array.length; i++) 
		  {    
	             
	          if(max < array[i]) 
			  {    
	              max = array[i];    
	              maxChar = string[i];    
	          }    
	      }             
	          
		return maxChar;
		
	}

	 public static void main(String[] args) 
	   {    
	       //Take input from the user 
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the string: ");
	        String str=sc.nextLine();
	        System.out.println("Max occurring character is " +maxChar(str));
	         
	  } 
}
