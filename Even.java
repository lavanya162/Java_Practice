import java.util.Scanner;
class Even
  {
    public static void main(String args[])
    {
      int a;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      a=sc.nextInt();
      if(a%2==0)
      {
        System.out.println("is a even number:");
        
      }
      else
      {
       System.out.println("is a not even number:"); 
      }
    }
  }