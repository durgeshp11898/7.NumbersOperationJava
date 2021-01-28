class SumofOddDigits
{
	public static void  main(String args[])
	{
		int no=4123;
		int sum=0;
		int rem=0;

		while(no!=0)
		{
			rem=no%10;
			if(rem%2!=0)
			{
				sum=sum+rem;

			}
			no=no/10;

		}
		System.out.println("Addition of odd digit is"+sum);
	}
}	
