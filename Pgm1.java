import java.io.*;
public class Pgm1
{
public static void main (String args[])throws IOException
{
String S1,S2;
int a,b;
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter the String");
S1=in.readLine();
System.out.println("Enter he start and end position");
a=Integer.parseInt(in.readLine());
b=Integer.parseInt(in.readLine());
S2=S1.substring(a,b);
System.out.println("result:"+S2);
}
}
