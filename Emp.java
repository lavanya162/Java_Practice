import java.util.Scanner;
class Emp
  {
    public static void main(String args[])
    {
      int eno;
      String ename;
      float esal;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Employee Nummber:");
      eno=sc.nextInt();
      System.out.println("Enter Employee Name:");
      ename=sc.next();
      System.out.println("Enter Employee Salary:");
      esal=sc.nextFloat();
      System.out.println("The Employee Nummber is:"+eno);
      System.out.println("The Employee Name is:"+ename);
      System.out.println("The Employee Salary:"+esal);
    }
  }