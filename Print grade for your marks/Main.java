import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      if (n>=85)
        System.out.print("A");
      else if (n>=45)
        System.out.print("E");
      else if (n<45)
        System.out.print("Fail");
    }
}