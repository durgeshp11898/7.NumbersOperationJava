class Add
{
	public static void main(String args[])
	{
		int num=19000,rev=0,c=0;


		while(num!=0)
		{
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;
			/*if(c%2==0)
			{
				b=b+c;
			}*/
			// System.out.print(c);
		//	a=a/10;
		}
		System.out.println(rev);
	}
}
