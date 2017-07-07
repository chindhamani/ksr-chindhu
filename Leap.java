import java.util.*;
public class Leap
{
  
  public static void main(String args[])
  {
    
    Scanner s=new Scanner(System.in);
    int a;
    a=s.nextInt();
    if(a%4==0||a%400==0)
    {
      
      System.out.println(a+"is Leap year");
      }
      else
      System.out.println("it is not leap year");
      
      }
      }
