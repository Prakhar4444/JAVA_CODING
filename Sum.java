//Programm to add two numbers using java command line
public class Sum
{
public static void main(String args[])
{
int a,b,sum;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
sum=a+b;
//"+" is used to add between the printing statementsS
System.out.println("The sum of "+a+" and "+b+" is "+sum);
}
}