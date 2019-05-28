import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      for ( int roe= 1; roe<=n; roe++){
        for ( int col= 1; col<=roe; col++){
          System.out.print(roe);
        }
        System.out.print("\n");
	}
}
}