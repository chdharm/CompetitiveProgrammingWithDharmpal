import java.util.*;
class LastDig
{
	static int last=1;
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int turn=scan.nextInt();
		while((turn--)>0){
			last=1;
			int a=scan.nextInt();
			int b=scan.nextInt();
			while((b--)>0){
				last=last*a;
				
			}
			System.out.println(last%10);
		}
		
	}
}