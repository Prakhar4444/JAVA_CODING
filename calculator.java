//java progrsm for a command line calculator
public class calculator
{
public static void main(String[] args)
{
int a,b,sub,mul,sum,div;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[2]);
System.out.println("helo" +args[1]);
if (args[1].equals("+"))
{
sum=a+b;
System.out.println("Sum of "+a+" and "+b+ " is "+sum);
}
else if (args[1].equals("-"))
{
sub=a-b;
System.out.println("Subtraction of "+a+" and "+b+ " is "+sub);
}
else if (args[1].equals("/"))
{
div=a/b;
System.out.println("Division of "+a+" and "+b+ " is "+div);
}
else if (args[1].equals("*"))
{
mul=a*b;
System.out.println("Multiplication of "+a+" and "+b+ " is "+mul);
}
else
System.out.println("ERRORAA");
}
}