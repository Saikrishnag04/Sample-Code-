import java.util.*;
class Calculator
{
public static void main(String args[])
{
String operator= "/,*,-,+";
int a,b;
Scanner s=new Scanner(System.in);
System.out.println("please select the operation from this =/,*,-,+ \n");
operator=s.nextLine();
System.out.println("the operation is select ="+operator);

switch(operator)
{
case "/":System.out.println(int a/ int b);
break;
case "*":System.out.println(int a*int b);
break;
case "-":System.out.println(int a-int b);
break;
case "+":System.out.println(int a+int b);
break;
}
System.out.println("please enter the value of a:");
a=s.nextInt();
System.out.println("please enter the value of b:");
b=s.nextInt();
}
}