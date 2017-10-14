import java.util.*;
import java.lang.*;
public class FCTL {
	static int zero;
   public static void main(String [] args){
	   Scanner scan=new Scanner(System.in);
		int turn=scan.nextInt();
		for(int i=0;i<turn;i++){
		   fzero(scan.nextInt());
		
		}
   }
   
   public static void fzero(int num){
		zero=0;
	   while(num>=5){
		   num=num/5;
		   zero=zero+num;
	   }
	  // zero=zero+num;
	   System.out.println(zero);

   }
   
}