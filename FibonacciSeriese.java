import java.util.*;
class FibonacciSeriese
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range of fibonassi  :");
		int no=sc.nextInt();

        	int  num1 = 0, num2 = 1;
       		 System.out.print("Fibonacci Series of "+no+" numbers:");

       		 int i=1;
      		 while(i<=no)
        	{
           	 System.out.print(num1+" ");
           	 int sumOfPrevTwo = num1 + num2;
           	 num1 = num2;
           	 num2 = sumOfPrevTwo;
           	 i++;
       		}
    
	}
}


