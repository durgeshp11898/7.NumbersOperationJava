class One
{
        public static void main(String args[])
        {
                int i=0,j=0,x=0,k=0;

                for(i=1;i<=5;i++)
                {
                        for(j=1;j<=5;j++)
                        {
                                if(j<=3)
                                        System.out.print(i+" ");
                        }
                        System.out.print("  ");
                       for(k=1;k<=5;k++)
                       {
                               System.out.print(k+" ");
                        }
                       System.out.print("  ");
                       for(x=1;x<=5;x++)
                       {
                               if(x<=i)
                               {
                                       System.out.print(x+" ");

                               }
                               else
                                       System.out.print("* ");
                       }
                       System.out.println();

                }

 	}
}	
