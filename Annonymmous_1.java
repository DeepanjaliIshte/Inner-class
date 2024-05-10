// 1.Program for anonymous inner class using class. 

abstract class Annonymmous_1
{	
	abstract void eat();
}
class Person
{
	public static void main(String[] args) 
	{
		Annonymmous_1 an=new Annonymmous_1()
		{
			void eat()
			{
				System.out.println("Nice Apple");
			}
		};
		an.eat();
	}
}

