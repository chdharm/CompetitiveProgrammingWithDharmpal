import java.util.*;
public class Fashionshow {
	static int result;
	public static void main(String [] args) throws java.lang.Exception{
		Scanner scan=new Scanner(System.in);
		int turn=scan.nextInt();
		for(int j=0;j<turn;j++){
		int size=scan.nextInt();
		result=0;
		int [] men=new int[size];
		int [] women=new int[size];
		for(int i=0;i<size;i++){
			men[i]=scan.nextInt();
		}
		for(int i=0;i<size;i++){
			women[i]=scan.nextInt();
		}
                Arrays.sort(men);
                Arrays.sort(women);
		
		for(int i=0;i<size;i++){
			result=result+(men[i]*women[i]);
		}
		System.out.println(result);
		}
	}
}
