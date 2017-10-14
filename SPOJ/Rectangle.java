import java.util.*;
import java.lang.*;
class Rectangle
{
	public static void main (String[] args) throws java.lang.Exception
	{   
		int count=0;
		Scanner scan=new Scanner(System.in);
		int s=scan.nextInt();
		for(int i=1;i<=s;i++){
			for(int j=i;j<=s;j++){
				if(i*j<=s){
					count++;
				}
			}
								
				}
			


		System.out.println(count);
	}
}