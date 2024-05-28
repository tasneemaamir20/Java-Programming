class patternTest
{
public static void main(String[]args)
{
/*
*               *
* *           * *
* * *       * * *
* * * *   * * * *
* * * * * * * * *
* * * *   * * * *
* * *       * * *
* *           * *
*               *

		int n=5;
		int star=1;
		int space=2*n-3;
		for(int i=1; i<2*n; i++)
		{
			
			for(int j=1; j<=star; j++)
			{
				System.out.print("*" + " ");
			}
			
			
			for(int j=1; j<=space; j++)
			{
				System.out.print(" " + " ");
			}
			
		
			for(int j=1; j<=star; j++)
			{
				if(j==n)
				{
				
				}
				else
				{
				System.out.print("*" + " ");
				}
			}
			
			if(i<n)
			{
				star++;
				space-=2;
			}
			else
			{
				star--;
				space+=2;

		}
			
			System.out.println();
			
		}



*/


/*

        A
      B   B
    C       C
  D           D
E               E
  D           D
    C       C
      B   B
        A

		char alp='A';
		int n=5;
		int k=1;
		int space=n;
		for(int i=1; i<2*n; i++)
		{

			// Space
			for(int j=1; j<space; j++)
			{
				System.out.print(" " + " ");
			}
			
			
			// Stars
			for(int j=1; j<k*2; j++)
			{
				if(j==1 || j==k*2-1)
				{
				System.out.print(alp + " ");
				}
				else
				{
				System.out.print(" " + " ");
				}
			}
			if(i<n)
			{
				space--;
				k++;
				alp++;
			}
			else
			{
				space++;
				k--;
				alp--
			}
			
			System.out.println();
		}


*/


/*
1 2 3 4 5 6 7 8 9
  2 3 4 5 6 7
    3 4 5



    3 4 5
  2 3 4 5 6 7
1 2 3 4 5 6 7 8 9
		int n=5;
		int num = n;
		int space = 1;
		int no=1;
		
		for(int i=1; i<2*n; i++)
		{

			
			for(int j=1; j<space; j++)
			{
				System.out.print(" " + " ");
			}
			
			
			for(int j=no; j<2*num; j++)
			{
				System.out.print( j + " ");
			}
			
			if(i<n)
			{
				no++;
				num--;
				space++;
			}
			else
			{
				no--;
				num++;
				space--;
			}
			
			System.out.println();
		}

*/









		char ch = 'A';
		int n=5;
		int num = n;
		int space = 1;
		for(int i=1; i<2*n; i++)
		{
			
			char ab = ch;
			for(int j=1; j<space; j++)
			{
				System.out.print(" " + " ");
			}
			
			
			for(int j=1; j<=num; j++)
			{
				System.out.print( ab + " ");
				ab++;
			}
			
			if(i<n)
			{
				num--;
				space++;
				
			}
			else
			{
				num++;
				space--;
				
			}

		System.out.println();
		}

}
}


