import java.math.BigInteger;
import java.util.*;
class Julka {

	
	
	public static void main(String [] args){
		 Scanner scan=new Scanner(System.in);
			int turn=10;
			while((turn--)>0){
				BigInteger x;
				BigInteger num=scan.nextBigInteger();
				BigInteger more=scan.nextBigInteger();
				x=(num.subtract(more)).divide(new BigInteger("2"));
				System.out.println(x.add(more));
				System.out.println(x);
	}
}
}