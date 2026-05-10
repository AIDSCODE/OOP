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

Product(int id, String name)
{
this.id = id;
this.name = name;
price = 0;
quantity = 0;
}

Product(int id, String name, double price, int quantity)
{
this.id = id;
this.name = name;
this.price = price;
this.quantity = quantity;
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

class Ecommerce
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

Product[] products = new Product[2];

products[0] = new Product(101, "Laptop", 55000, 1);

products[1] = new Product();

System.out.print("Enter Product ID: ");
products[1].id = sc.nextInt();

sc.nextLine();

System.out.print("Enter Product Name: ");
products[1].name = sc.nextLine();

System.out.print("Enter Product Price: ");
products[1].price = sc.nextDouble();

System.out.print("Enter Product Quantity: ");
products[1].quantity = sc.nextInt();

double totalAmount = 0;

for(int i = 0; i < 2; i++)
{
totalAmount += products[i].getTotal();
}

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