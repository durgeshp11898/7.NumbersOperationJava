class Sum70Mod
{
	public static void main(String args[])
	{
		int i=0;
		int sum=0;

		for(i=1;i<=70;i++)
		{
			if(70%i==0)
			{
			System.out.print("  "+i);
				sum=sum+i;
			}
		}
	System.out.println();
	System.out.println("Sum "+sum);
	}
}

