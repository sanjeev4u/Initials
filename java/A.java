public class A
{
	public static void main(String[] args) 
	{
		int i;
		int j;
		int k;
		int l;
		for(i=0;i<10;i++)
		{
			if(i==4)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
		for(l=1;l<=9;l++)
		{
			for(j=1;j<=9;j++)
			{
				if(j==5+l || j==5-l)
				{
					System.out.print("*");
					if(l==2)
					{ 
						for(k=1;k<=4;k++)
						{
						System.out.print("*");
						}
						break;
					}
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
