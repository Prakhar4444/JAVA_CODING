//Problem to find the largest among the three numbers
public class Largesta
{
//public is to use to excess it from outside
//static is used as we are not declaring any object
public static void main(String[] ab)
{
int a,b,c;
//a[0] contains first input from command line
a=Integer.parseInt(ab[0]);
b=Integer.parseInt(ab[1]);
c=Integer.parseInt(ab[2]);
if (a>b && a>c)
System.out.println("A is the largest number");
else if (b>a && b>c)
System.out.println("B is the largest number");
else if (c>a && c>b)
System.out.println("C is the largest number");
else
System.out.print("Not applicable");
}
}
