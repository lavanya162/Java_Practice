import java.util.Scanner;
class Th_big
  {
    public static void main(String args[])
    {
      int a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      a=sc.nextInt();
      System.out.println("Enter b number:");
      b=sc.nextInt();
      System.out.println("Enter c number:");
      c=sc.nextInt();
      if(a>b)
      {
        System.out.println("a is big number");
      }
      else if(b>a&&b>c)
      {
       System.out.println("b is big number"); 
      }
      else
      {
       System.out.println("c is big number");  
      }
    }
  }