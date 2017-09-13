public class alpha_square 
{
	public static void main(String[] args)
	{
		int a=65,b=90,c=0;
		for(int i=0;i<=7;i++)
		{
			System.out.print((char) a);
			c++;
			a++;
			if(c==8)
			{
				System.out.println();
				for(int j=0;j<5;j++)
				{
					System.out.print((char) b);
					b--;
					for(int k=0;k<6;k++)System.out.print(" ");
					System.out.print((char) a);
					a++;
					System.out.println();
				}
					for(int l=0;l<=7;l++)
					{
						System.out.print((char) b);
						b--;
					}
					System.out.println();
			}
		}
	}
}
