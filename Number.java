import java.util.*;
public class Number
{
  
  public static void main(String args[])
  {
    int rem=0,count=0;
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();

    for(int i=0;n!=0;i++)
    {
       rem=n%10;
       count++;
       n=n/10;
       }
       System.out.println(count);
       }
       }
    
