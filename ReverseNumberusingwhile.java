import java.util.*;

class ReverseNumberusingwhile
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int rev=0,rem=0;
		System.out.println("Enter number to Reverse   :");
		int no=sc.nextInt();

		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("Revrse number are  :"+rev);
	}
}
