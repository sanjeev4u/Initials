public class star7
{
	public static void main(String[] args) 
	{

		int c=0;
		for(int k=0;k<=10;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		for(int i=0;i<10;i++)
		{
			System.out.print("*");
			for(int j=10;j>i;j--)
			{
				System.out.print(" ");
				c++;
			}
			if(c>0 && i<9)
			{
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
