1.
import java.util.Scanner;
class Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			String[] s = sc.nextLine().split(" ");
			int n = sc.nextInt();
			int m = sc.nextInt();
			for(int i = n;i <= m;i++){
				if(isPrime(i)){
					System.out.println(i);
				}
			}
		}
	}
	static boolean isPrime(int num) {
        if(num==2) 
            return true;
            
       else if(num==1) return false;
 
        int to = (int) Math.sqrt(num) + 1;
        for (int i = 2; i <= to; i++) {
            if (num % i == 0) {
                return false;                
            }
        }
        return true;
    }
	} 