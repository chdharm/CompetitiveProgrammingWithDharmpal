import java.util.*;
class ACPC10
{
	public static void ap(int a,int b){
		System.out.println("AP"+" "+(a+b));
		return;
	}
	public static void gp(int a,int b){
		System.out.println("GP"+" "+(a*b));
		return;
	}
	public static void main (String[] args) throws java.lang.Exception
	{ 
		Scanner scan=new Scanner(System.in);
	     while(scan.hasNextInt()){
	     	int x=scan.nextInt();
	     	int y=scan.nextInt();
	     	int z=scan.nextInt();
	     	if(x==0&&y==0&&z==0){
	     		break;
	     	}
	     	if((y-x)==(z-y)){
	     		ap(z,z-y);
	     	}
	     	else{
	     		gp(z,z/y);
	     	}
	     }
		
	}
}
