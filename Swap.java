import java.util.Scanner;
class Swap
  {
    public static void main(String args[])
    {
      int a;
      int b;
      int temp=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the a value:");
      a=sc.nextInt();
      System.out.println("enter the b value:");
      b=sc.nextInt();
      System.out.println("before swapping value is:");
      System.out.println("a="+a);
      System.out.println("b="+b);
      System.out.println("");
      temp=a;
      a=b;
      b=temp;
      System.out.println("After swapping value is:");
      System.out.println("a="+a);
      System.out.println("b="+b);
    }
  }