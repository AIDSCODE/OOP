import java.util.Scanner;

abstract class Animal
{
abstract void sound();
abstract void move();
abstract void sleep();

void eat()
{
System.out.println("Animal eats food");
}

void drink()
{
System.out.println("Animal drinks water");
}

void breathe()
{
System.out.println("Animal breathes air");
}
}

class Dog extends Animal
{
public void sound()
{
System.out.println("Dog barks");
}

public void move()
{
System.out.println("Dog runs");
}

public void sleep()
{
System.out.println("Dog sleeps");
}
}

class Cat extends Animal
{
public void sound()
{
System.out.println("Cat meows");
}

public void move()
{
System.out.println("Cat walks");
}

public void sleep()
{
System.out.println("Cat sleeps");
}
}

public class TestAnimal
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
Animal a;

System.out.println("Choose Animal:");
System.out.println("1. Dog");
System.out.println("2. Cat");

int choice = sc.nextInt();

if(choice == 1)
{
a = new Dog();
}
else if(choice == 2)
{
a = new Cat();
}
else
{
System.out.println("Invalid choice");
return;
}

a.sound();
a.move();
a.sleep();

a.eat();
a.drink();
a.breathe();

sc.close();
}
}