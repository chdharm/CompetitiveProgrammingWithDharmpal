import java.util.*;
import java.lang.*;
class AddReverse 
{
	static int reve;

	public static int rev(int a){
		reve=0;
	    while(a!=0){
		  reve=reve*10+a%10;
		  a=a/10;
	    }
	    return reve;
	  }
public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int turn=scan.nextInt();
		for(int i=0;i<turn;i++){
          int first=rev(scan.nextInt());
		  System.out.println(first);
		  int second=rev(scan.nextInt());
		  System.out.println(second);
		  int add=first+second;
		  add=rev(add);
		  System.out.println(add);
		   }

       }
}
