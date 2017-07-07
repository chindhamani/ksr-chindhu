 import java.io.*;   


public class HelloWord
{
    public static void main(String args[])throws IOException
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a;
        a=br.readLine();
        for(int i=0;i<5;i++)
        {
          
          System.out.println("Hello word");
        }
    }
}
