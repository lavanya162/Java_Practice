import java.util.Scanner;
class Year
  {
    public static void main(String args[])
    {
      int a;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a year:");
      a=sc.nextInt();
      if((a%400==0)||(a%4==0)&&(a%100!=0))
      {
        System.out.println("is leapyear");
        
      }
      else
      {
       System.out.println("is not leapyear"); 
      }
    }
  }