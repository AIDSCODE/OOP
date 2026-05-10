import java.util.Scanner;
class SimpleCalculator
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
char ch;

do
{
System.out.println("1. Addition");
System.out.println("2. Subtraction");
System.out.println("3. Multiplication");
System.out.println("4. Division");

System.out.print("Enter your choice: ");
int choice = sc.nextInt();

System.out.print("Enter first number: ");
int num1 = sc.nextInt();

System.out.print("Enter second number: ");
int num2 = sc.nextInt();

int result;

switch(choice)
{
case 1:
result = num1 + num2;
System.out.println("Result = " + result);
break;

case 2:
result = num1 - num2;
System.out.println("Result = " + result);
break;

case 3:
result = num1 * num2;
System.out.println("Result = " + result);
break;

case 4:
if(num2 != 0)
{
result = num1 / num2;
System.out.println("Result = " + result);
}
else
{
System.out.println("Error: Cannot divide by zero");
}
break;

default:
System.out.println("Invalid choice");
}

System.out.print("Do you want to continue? (y/n): ");
ch = sc.next().charAt(0);

}while(ch == 'y' || ch == 'Y');

sc.close();
}
}