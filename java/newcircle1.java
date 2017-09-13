public class newcircle1
{
	public static void main (String args[])
	{
		for(int i=-10;i<=10;i++)
		{
			for(int j=-10;j<=10;j++)
			{
				if(((i*i)+(j*j))==25)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
