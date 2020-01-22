// Programm to print a fabonacci series upto n elements
public class Fabonacci
{
public static void main(String args[])
{
int i,a,b,c;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
System.out.print(+a+"::");
System.out.print(+b);
for(i=0;i<10;i++)
{
System.out.print("::");
c=a+b;
//Intechanging the numbers for fabonacci series	
a=b;
b=c;
System.out.print(+c);
}
}
}