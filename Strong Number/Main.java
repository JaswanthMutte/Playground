import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num=n ;
      int sum =0;
      while (n>0){
        int rem = n %10;
        int fac=1;
        for ( int count =1; count <=rem; count++)
        {
          fac = fac * count;
        }
        sum = sum + fac;
        n= n/10;
      }
      if ( num ==sum)
        System.out.print("Yes");
      else
        System.out.print("No");
	}
}