
import java.util.*;
import java.lang.*;
import java.io.*;
class InfixToPostFix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Stack s= new Stack();
		Scanner sc= new Scanner(System.in);
		int no_of_inputs = sc.nextInt();
		for(int i=0;i<no_of_inputs;i++)
		{
		    String inp=sc.next();
		    int count=inp.length();
		    int j=0;
		    while(j!=count)
		    {		   
		        char test=inp.charAt(j);
		        if (Character.isLetter(test))
		            System.out.print(test);
		        else if(test=='^' || test=='*' || test=='/' || test=='+' || test=='-')
		                s.push(test);
		        else if(test==')')
		                System.out.print(s.pop());		 
		        j++;		        
		    }
		    System.out.println();
		}				
	}
}