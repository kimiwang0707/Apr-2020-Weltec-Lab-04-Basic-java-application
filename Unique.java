/*
*/

import java.util.Scanner;
public class Unique
{
   public static void main (String [] args)
   {
      Scanner input = new Scanner( System.in );  
      int count = 0; 
      int entered = 0; 
      System.out.print("Please enter the size of array: ");
      int size = input.nextInt();
      System.out.println();
      int [] numbers = new int [size];
      boolean containsNumber = false;
      
      for( entered = 0; entered < 30; entered++ )
      {
    	  containsNumber = false;    	  
    	  System.out.print( "Enter number: " );
          int num = input.nextInt();
          
          if (num >= 10 && num <= 100)
          { 
        	  for (int ele : numbers)
        	  {
        		  if (ele == num)
        		  {
        			  System.out.printf("%d has already been entered.\n", num);
        			  containsNumber = true; 
        		  }
        	  }        
         
        	  if (!containsNumber)
        	  {	
        		  numbers [count] = num;
        		  count++;         		 
        	  }
        	  
        	  for (int i = 0; i < count; i++)
    		  {
    			  System.out.printf(numbers [i] + " ");
    		  }
    		  	  System.out.println();
    		  	  
    		  if (count == size)	 
    		  {
    			  break;
    		  }       	  
         
          } else
          		{
        	  		System.out.println("Number must be between 10 and 100.");
          		}             
          
      }           
   }
}