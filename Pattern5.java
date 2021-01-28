class Pattern5

{
	public static void main(String args[])
	{
		int cnt=1;
		int i=0,j=0;

		for(i=0;i<5;i++)
		{
			for(j=5;j>i;j--)
			{
				System.out.print("  "+cnt++);
				
			}
			System.out.println();
		}
	}
}
