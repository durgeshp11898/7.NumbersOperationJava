class Rsum
{
	public static void main(String args[])
	{
		int i=0;
		int fsum=0;
		for(i=200;i<=300;i++)
		{
			int no=i;
			int sum=0,rem=0;
			while(no!=0)
			{
				rem=no%10;
				sum=sum+rem;
				no=no/10;
			}
			if(sum==11)
			{
				fsum=fsum+no;
			}
		}
		System.out.println(fsum);
	}
}
