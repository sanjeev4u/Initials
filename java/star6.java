public class star6
{
	public static void main(String[] args) 
	{

		int c=0;
		for(int i=0;i<4;i++)
		{
			System.out.print("*");
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
				c++;
			}
			if(c>0 && i<4)
			{
				System.out.print("*");
			}
			System.out.println();

		}
		for(int k=0;k<=4;k++)
		{
			System.out.print("*");
		}
	}
}
