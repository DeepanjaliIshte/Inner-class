// 2] We are creating msg() method in member inner class that is accessing the private data member of outer class. 

public class Member_Test 
{
	private int data=30;
	class Inner
	{
		void msg()
		{
			System.out.println("Data is "+data);
		}
	}
	public static void main (String args[])
	{
		Member_Test meb = new Member_Test();
		Member_Test.Inner in = meb.new Inner();
		in.msg();
	}
}
