class One
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int i=0,sum=0;

		for(i=1;i<a.length;i++)
		{
			a[i]=10*i;
			sum=sum+a[i];

		}
		System.out.println(sum);
	}

}
