// 3] Program for Local Inner class
public class Local_Test 
{
	private int data= 100;	// instance variable
	void display() 
	{
		class Local
		{
			void msg()
			{
				System.out.println(data);
			}
		}
			Local lc=new Local();
			lc.msg();
		}
	public static void main(String[] args) 
	{
		Local_Test obj =new Local_Test();
		obj.display();
	}
}
