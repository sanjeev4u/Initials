public class Demo1
{
		static int a=123;//instance variables
		static int b=254;
		public static void main(String[] args)
		{
			System.out.println(a+b);//instance  variablles called
			Demo1 d=new Demo1();
			System.out.println(d.b-d.a);
			System.out.println(Demo1.a);
			
		}
}