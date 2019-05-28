import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int [n];
    for(int i =0; i<n; i++)
    { arr[i]=in.nextInt(); }
    perfect_batch(arr, n);
  }
  public static void perfect_batch(int arr[], int n)
  { boolean perfect_batch=true;
    int sum = arr[0]+arr[1]+arr[2];
    for (int i=3 ; i<n; i=i+3)
    { int  Sum=arr[i]+arr[i+1]+arr[i+2];
   if( sum!=Sum)
   { perfect_batch=false;}
    }
   if(perfect_batch==true)
   {System.out.print("Perfect Batch");}
    else
    {System.out.print("Not a Perfect Batch");}
   }
  }