// 1] Program for Inner class.

public class Test_1 
{
	int num;
	// Inner class
	private class Inner_demo
	{
		public void print()
		{
			System.out.println("This is an inner class");
		}
	}
	void display_Inner()
	{
		Inner_demo inner =new Inner_demo();
		inner.print();
	}
}
