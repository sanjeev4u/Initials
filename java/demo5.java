public class demo5
{
	public static void main(String args[])
	{
		String s1=new String("Java");
		System.out.println(s1 instanceof String);
		System.out.println(s1 instanceof Object);

		demo5 dd=new demo5();
		System.out.println(dd instanceof demo5);
		System.out.println(dd instanceof Object);

	}
}