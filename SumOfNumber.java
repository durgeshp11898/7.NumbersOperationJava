class SumOfNumber
{
	public static void main(String args[])
	{
		int i=0;
		int fsum=0,fsumn=0;

		for(i=200;i<=300;i++)
		{
			int num=i;
			int no=num;
			int sum=0,rem=0;
			
			while(num!=0)
			{
				
				rem=num%10;
				sum=sum+rem;
				num=num/10;
				
			}
			if(sum%11==0)
			{
			        System.out.print("  "+no);
				fsum=fsum+no;
			}
			
		}
	System.out.println();	
	System.out.println("Sum of total numbers is      "+fsum);

	}
}
