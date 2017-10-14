import java.util.*;
class SecondMethodOfLastDig
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
			System.out.println(bigmod(a,b,10));
		}
		
	}
	static int bigmod(int a,int p,int m)
{
      if(p==0)
      return 1;

      if(p%2==0){
      int c=bigmod(a,p/2,m);
      return c*c%m;
      }
      else
      return (a*bigmod(a,p-1,m)) %m;

}
}