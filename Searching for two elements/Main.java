import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arrz= in.nextInt();
      int arr[]=new int[arrz];
      for (int i=0; i<arrz; i++)
      {
        arr[i]=in.nextInt();
      }
      int ele1=in.nextInt();
      int ele2=in.nextInt();
      int ele_1=-1;
      int ele_2=-1;
      for(int i=0; i<arrz; i++)
      {
     if (ele1==arr[i])
     { ele_1=i; }
        if (ele2==arr[i])
        {ele_2=i; }
      } System.out.println(ele_1);
        System.out.println(ele_2);
      }
    }
