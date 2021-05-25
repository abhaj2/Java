import java.io.*;
public class Q1
{
public static void main(String args[])throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
int sum=0, per=0,i;
int a[]=new int[5];
for(i=0;i<5;i++)
{
System.out.println("Enter the elements");	
a[i]=Integer.parseInt(in.readLine());
sum=sum+a[i];
per=(sum*100)/500;
}
System.out.println("The sum is " + sum);
System.out.println("The percentage is " + per);
}
}
