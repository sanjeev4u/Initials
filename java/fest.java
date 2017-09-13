  public class fest 
{
	int a=12;
	int b=13;
	static int c=14;
	static int d=15;
	void m1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(fest.c);
		System.out.println(fest.d);
	}
	static void m2()
	{
		fest t=new fest();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(c);
		System.out.println(d);
	}
	public static void main(String[] args)
	{
		m2();
		fest t=new fest();
		t.m1();
	}
}