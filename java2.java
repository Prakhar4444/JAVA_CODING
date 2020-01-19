
public class java2 
{
	public void nonstaticclass()
	{
		System.out.println("Hello i am a non static class i require a object to excess my class ");
	}
	public static void staticclass() 
	{
		System.out.println("Hy i am a static class i do not require any object to call myself ");
	}
	public static void main(String args[])
	{
		System.out.println("Hello I am From main function ");
		java2 object_for_nonstaticclass = new java2();
		object_for_nonstaticclass.nonstaticclass();
		staticclass();
	}
}
