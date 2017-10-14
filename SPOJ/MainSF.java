import java.util.*;
import java.lang.*;
import java.math.BigInteger;

class MainSF
{
	static BigInteger facto;
	static int turn;
	static int j;
	public static void fact(int a){
		facto=BigInteger.ONE;
		for(int i=1;i<=a;i++){
			facto = facto.multiply(BigInteger.valueOf(i));
		} 
		if(j==turn){
			System.out.print(facto);
		}
		else{
		System.out.println(facto);
		}
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		turn=scan.nextInt();
		for(int j=1;j<=turn;j++){
			fact(scan.nextInt());
		}
		
		
	}
}