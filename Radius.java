import java.util.Scanner;
class Radius
  {
    public static void main(String args[])
    {
      int r;
      float pi,area;
      Scanner sc=new Scanner(System.in);
      System.out.println("The radius values:");
      r=sc.nextInt();
      System.out.println("The float values:");
      pi=sc.nextFloat();
      System.out.println("The area of circle is:");
      area=pi*r*r;
      System.out.println(area);
      
    }
  }