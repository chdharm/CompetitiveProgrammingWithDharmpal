public class Pattern2 {
	public static void main(String [] args){
		int i,j,num ;
		for (i=1; i<=7; i++){
			System.out.println();
			num=1;
			for (j=1;j<=i;j++){
				System.out.print(num);
				num++;
			}
			for(j=i-1;j>=1;j--){
			System.out.print(j+ "");
			}
		}
	}
}
