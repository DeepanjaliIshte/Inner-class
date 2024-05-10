// 2. Program for anonymous inner class example using interface. 

interface Annonymous_2 
{
	void eat();
}
class Eatable
{
	public static void main(String args[])
	{
		Annonymous_2 ann=new Annonymous_2()
		{
			public void eat()
			{
				System.out.println("Nce Pineapple");
			}
		};
		ann.eat();		
	}
}
