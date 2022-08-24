import java.util.Scanner;
class Positive
  {
    public static void main(String args[])
    {
      int a;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Positive:");
      a=sc.nextInt();
      if(a>0)
      {
        System.out.println("is a positive number:");
        
      }
      else
      {
       System.out.println("is not a positive"); 
      }
    }
  }