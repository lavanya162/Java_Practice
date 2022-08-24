import java.util.Scanner;
class Tempswap
  {
    public static void main(String args[])
    {
      int a;
      int b;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the a value:");
      a=sc.nextInt();
      System.out.println("enter the b value:");
      b=sc.nextInt();
      System.out.println("before swapping value is:");
      System.out.println("a="+a);
      System.out.println("b="+b);
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("After swapping value is:");
      System.out.println("a="+a);
      System.out.println("b="+b);
    }
  }