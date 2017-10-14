import java.util.*;
public class Nikita{

public static void main(String [] args){
    Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    scan.nextLine();
    while((t--)>0){
       nikita(scan.nextLine());
    }
  }
  public static void nikita(String s){
  	StringTokenizer str=new StringTokenizer(s," ");
  	int count=str.countTokens();
  	if(count<=0||count>3){
  	   return;	
  	}
  	switch(count){
  		case 1:
  		//System.out.println("1");
  			System.out.println(s.substring(0,1).toUpperCase()+s.substring(1,s.length()).toLowerCase());
  			break;
  		case 2:
  		//	System.out.println("2");
  			String s1=str.nextToken();
  			//System.out.println(s1);
  			String s2=str.nextToken();
  			//System.out.println(s2);
  		    System.out.println((s1.substring(0,1)).toUpperCase()+". "+(s2.substring(0,1)).toUpperCase()+(s2.substring(1,s2.length())).toLowerCase());
  			break;
  		case 3:
  		//	System.out.println("3");
  			String s3=str.nextToken();
  		    String s4=str.nextToken();
  		 	String s5=str.nextToken();
  		 	System.out.println((s3.substring(0,1)).toUpperCase()+". "+(s4.substring(0,1)).toUpperCase()+". "+(s5.substring(0,1)).toUpperCase()+(s5.substring(1,s5.length())).toLowerCase());
  			break;
  	}
  }
}