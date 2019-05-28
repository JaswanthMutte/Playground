import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in = new Scanner(System.in);
      int option=in.nextInt();
      switch(option)
      {
        case 1:
      int side =in.nextInt();
      int area=side*side;
      System.out.print(area);
      break;
      case 2:
      int len=in.nextInt();
      int bre=in.nextInt();
      int a2= len*bre;
      System.out.print(a2);
      break ;
      case 3:
      int base = in.nextInt();
      int height= in.nextInt();
      int a3= (base*height)/2 ;
      System.out.print(a3);
      break ;
      case 4:
      int r=in.nextInt();
      double a4=3.14*r*r ;
      System.out.print(a4);
      break ;
    }
    }
}