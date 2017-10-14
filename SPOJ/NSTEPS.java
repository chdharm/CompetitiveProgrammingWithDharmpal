import java.util.*;
import java.lang.*;

class NSTEPS
{
	public static void nst(int a,int b){
		if(a%2==0&&b%2==0)
		    System.out.println(a+b);
		else if(a%2!=0&&b%2!=0)
		    System.out.println(a+b-1);
		    else if((a%2!=0&&b%2==0)||(a%2==0&&b%2!=0))
		       System.out.println("No Number");   
		         
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		turn=scan.nextInt();
	
		 for(int j=1;j<=turn;j++){
			int x=scan.nextInt();
			int y=scan.nextInt();
		    nst(x,y);
		}
		
	}
}