import java.util.Scanner;
class Big
  {
    public static void main(String args[])
    {
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      a=sc.nextInt();
      System.out.println("Enter b number:");
      b=sc.nextInt();
      if(a>b)
      {
        System.out.println("a is big number");
      }
      else
      {
       System.out.println("a is not big number"); 
      }
    }
  }