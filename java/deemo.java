public class deemo  
{
	public static void main(String[] args) 
	{
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<8;j++)
			{
			if(i==0) System.out.print((char) (65+j));
			else if(j==7) System.out.print((char) (72+i));
			else if(j==0) System.out.print((char) (91-i));
			else if(i==6) System.out.print((char) (85-j));
			else System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}
