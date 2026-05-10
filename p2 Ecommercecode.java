
import java.util.Scanner;

class Product
{
int id;
String name;
double price;
int quantity;

Product()
{
id = 0;
name = "";
price = 0;
quantity = 0;
}

int getId()
{
return id;
}

String getName()
{
return name;
}

double getPrice()
{
return price;
}

int getQuantity()
{
return quantity;
}

double getTotal()
{
return price * quantity;
}
}

class Ecommercecode
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

Product[] products = new Product[2];

products[0] = new Product();
products[0].name = "Laptop";

System.out.print("Enter Laptop ID: ");
products[0].id = sc.nextInt();

System.out.print("Enter Laptop Price: ");
products[0].price = sc.nextDouble();

System.out.print("Enter Laptop Quantity: ");
products[0].quantity = sc.nextInt();

products[1] = new Product();

System.out.print("\nEnter Second Product ID: ");
products[1].id = sc.nextInt();

sc.nextLine();

System.out.print("Enter Second Product Name: ");
products[1].name = sc.nextLine();

System.out.print("Enter Price: ");
products[1].price = sc.nextDouble();

System.out.print("Enter Quantity: ");
products[1].quantity = sc.nextInt();

double totalAmount = products[0].getTotal() + products[1].getTotal();

double discount = 0;

if(totalAmount >= 5000)
{
discount = totalAmount * 0.10;
}

double finalAmount = totalAmount - discount;

System.out.println("\n===== INVOICE =====");

for(int i = 0; i < 2; i++)
{
System.out.println("\nProduct ID   : " + products[i].getId());
System.out.println("Product Name : " + products[i].getName());
System.out.println("Price        : " + products[i].getPrice());
System.out.println("Quantity     : " + products[i].getQuantity());
System.out.println("Total        : " + products[i].getTotal());
}

System.out.println("\nTotal Amount : " + totalAmount);
System.out.println("Discount     : " + discount);
System.out.println("Payable Amt  : " + finalAmount);

System.out.println("\nThanks For Shopping!");

sc.close();
}
}

