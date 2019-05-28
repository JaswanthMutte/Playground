import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arrz= in.nextInt();
      int arr[]=new int[arrz];
      for(int i=0; i<arrz; i++)
      {arr[i]=in.nextInt();}
      int max;
      if (arr[0]<arr[1])
      { max=arr[1];}
      else
      { max=arr[0];}
      for(int i =0; i<arrz; i++)
      { if (max<arr[i])
      {max=arr[i];}
    } System.out.print(max);
    }
}