import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int arrz=in.nextInt();
     int arr[]=new int[arrz];
      for(int i=0; i<arrz; i++)
      {
        arr[i]=in.nextInt();
      }
      zeros(arrz, arr);
      for(int i=0; i<arrz; i++){
        System.out.print(arr[i]+" ");}
    }
  public static void zeros(int arrz, int arr[])
  { int count=0;
   for (int i=0; i<arrz; i++){
     if (arr[i]!=0){
       int temp=arr[i];
       arr[i]=arr[count];
       arr[count]=temp;
       count++;}
   }
    }
}