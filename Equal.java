import java.util.Scanner;
class Equal
  {
    public static void main(String args[])
    {
      int a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the a value:");
      a=sc.nextInt();
      System.out.println("Enter the b value:");
      b=sc.nextInt();
      System.out.println("Enter the c value:");
      c=sc.nextInt();
      if(a==b&&b==c&&c==a)
      {
        System.out.println("equal number");
      }
      else
      {
       System.out.println("not equal bnumber"); 
      }
    }
  }