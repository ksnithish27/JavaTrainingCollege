class Animal 
{
	void eat(){
		System.out.println("eating...");
	}//eat()
}//Animal
class Dog extends Animal
{
	void bark(){
		System.out.println("Barking");
	}//Bark()
}//Dog
public class TestInheritance
{
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		d.bark();
		d.eat();
	}//main()
}//TestInheritance
