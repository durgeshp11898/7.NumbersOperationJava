class Nine
{
	public static void main(String args[])
	{
		int i=0,j=0;

		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(i==j)
				{
					System.out.print(" 1 ");
				}
				else
					System.out.print(" 0 ");
			}
			System.out.println();
		}
	}
}
