 class PatterPrinting{
	public static void main(String[]args){

	/*


1111
2222
3333
4444
5555



for (int i=1; i<=5; i++){
	for(int j=1; j<=5; j++){
	System.out.print(i);
	}
	System.out.println();
}


*/



	/*




12345
12345
12345
12345
12345



 for (int i=1; i<=5; i++){
	for(int j=1; j<=5; j++){
	System.out.print(j);
	}
	System.out.println();
	}
	*/
	
	/* for (int i=5; i>=1; i--){
	for(int j=5; j>=1; j--){
	System.out.print(j);
	}
	System.out.println();
	}
	*/

	/* for (int i=5; i>=1; i--){
	for(int j=5; j>=1; j--){
	System.out.print(i);
	}
	System.out.println();
	}
	*/
	


	/*



ABCDE
ABCDE
ABCDE
ABCDE
ABCDE



	for (int i=5; i>=1; i--){
	for(char j='A'; j<='E'; j++){
	System.out.print(j);
	}
	System.out.println();
	}
	

	System.out.println();

	*/


	
	/*


1
12
123
1234
12345


	for(int i=1; i<=5; i++)
	{
		for(int j=1; j<=i; j++)
		{
		  System.out.print(j);
		}
		System.out.println();
	}
	System.out.println();
	
	*/





/*


A
AB
ABC
ABCD
ABCDE



	for(char i='A'; i<='E'; i++)
	{	
		for(char j='A'; j<=i; j++)
		{	
		    System.out.print(j);
		}
	System.out.println();
	}

	


*/


/*



*****
****
***
**
*


	for(int i=1; i<=5; i++)
	{	
		for(int j=5; j>=i; j--)
		{	
		    System.out.print("*");
		}
	System.out.println();
	}
	System.out.println();





*/


/*


p
qr
stu
vwxy


	char k='p';
	for(int i=4; i>=1; i--)
	{	
		for(int j=4; j>=i; j--)
		{	
		    System.out.print(k++);
		}
	System.out.println();
	}
	System.out.println();






*/


/*


54321
5432
543
54
5


	for(int i=1; i<=5; i++)
	{	
		for(int j=5; j>=i; j--)
		{	
		    System.out.print(j);
		}
	System.out.println();
	}
	System.out.println();




*/


/*

12345
1234
123
12
1



	for(int i=5; i>=1; i--)
	{	
		for(int j=1; j<=i; j++)
		{	
		    System.out.print(j);
		}
	System.out.println();
	}
	System.out.println();





*/


/*

11111
2222
333
44
5


	for(int i=1; i<=5; i++)
	{	
		for(int j=5; j>=i; j--)
		{	
		    System.out.print(i);
		}
	System.out.println();
	}
	System.out.println();



*/


/*


5
54
543
5432
54321


	for(int i=5; i>=1; i--)
	{	
		for(int j=5; j>=i; j--)
		{	
		    System.out.print(j);
		}
	System.out.println();
	}
	System.out.println();




*/


/*


1 2 3 4 5
2 3 4 5
3 4 5
4 5
5


	for(int i=1; i<=5; i++)
	{	
		for(int j=i; j<=5; j++)
		{	
		    System.out.print(j+" ");
		}
	System.out.println();
	}
	System.out.println();



*/





/*


* * * * *
  * * * *
    * * *
      * *
        *


	for(int i=5; i>=1; i--)
	{	
		for(int j=5; j>i; j--)
		{
		   System.out.print("  ");	
		}
			for(int j=i;j>=1;j--){
			System.out.print("* ");
			
		}
		System.out.println();
	}
	


*/


/*

5 4 3 2 1
  4 3 2 1
    3 2 1
      2 1
        1


	for(int i=5; i>=1; i--)
	{	
		//Space 
		for(int j=5; j>i; j--)
		{
		   System.out.print("  ");	
		}
		// print Number
		for(int j=i; j>=1; j--)
		{
		   System.out.print(j+" ");
			
		}
		System.out.println();
	}
	



*/


/*

1 2 3 4 5
  1 2 3 4
    1 2 3
      1 2
        1

	
	for(int i=5; i>=1; i--)
	{	
		//Space 
		for(int j=5; j>i; j--)
		{
		   System.out.print("  ");	
		}
		// print Number
		for(int j=1; j<=i; j++)
		{
		   System.out.print(j+" ");
			
		}
		System.out.println();
	}
	

*/


/*


1 2 3 4 5
  2 3 4 5
    3 4 5
      4 5
        5
	
	for(int i=1; i<=5; i++)
	{	
		//Space 
		for(int j=1; j<i; j++)
		{
		   System.out.print("  ");	
		}
		// print Number
		for(int j=i; j<=5; j++)
		{
		   System.out.print(j+" ");
			
		}
		System.out.println();
	}
	



	
	*/


/*

        *
      * *
    * * *
  * * * *
* * * * *
	
	for(int i=1; i<=5; i++)
	{	
		//Space 
		for(int j=5; j>i; j--)
		{
		   System.out.print("  ");	
		}
		// print Number
		for(int j=1; j<=i; j++)
		{
		   System.out.print("* ");
			
		}
		System.out.println();
	}
	
*/


/*


Q.          1
         1  2
      1  2  3
   1  2  3  4
1  2  3  4  5




	for(int i=1; i<=5; i++)
	{	
		//Space 
		for(int j=5; j>i; j--)
		{
		   System.out.print("   ");	
		}
		// print Number
		for(int j=1; j<=i; j++)
		{
		   System.out.print(j+"  ");
			
		}
		System.out.println();
	}
	

*/


/*


	
Q.      5
      5 4
    5 4 3
  5 4 3 2
5 4 3 2 1
	

	for(int i=5; i>=1; i--)
	{	
		//Space 
		for(int j=1; j<i; j++)
		{
		   System.out.print("  ");	
		}
		// print Number
		for(int j=5; j>=i; j--)
		{
		   System.out.print(j+" ");
			
		}
		System.out.println();
	}
	

*/	
	/*
	1
	0 1
	0 1 0
        1 0 1 0
	1 0 1 0 1 
	

	int k=1;
	for()
	{
		for()
		{
			System.out.print(" ");	
		}
		for()
		{
		}
	}


*/


/*

	
	* * * * *
	*	*
	*	*
	*	*
	* * * * *
	
 	
	for(int i=1; i<=5; i++)
	{
		
		for(int j=1; j<=5;j++)
		{
	 	if(i==1 || i==5 || j==1 || j==5)
			{
			System.out.print("* ");
			}
			else
			{
			System.out.print("  ");
			}
		}
	System.out.println();
	}



*/


/*


Q 

*
*
*
*
* * * * *


	for(int i=1; i<=5; i++)
	{
		
		for(int j=1; j<=5;j++)
		{
	 	if(j==1 || i==5 )
			{
			System.out.print("* ");
			}
			else
			{
			System.out.print("  ");
			}
		}
	System.out.println();
	}


*/


/*




*       *
* *   * *
*   *   *
* *   * *
*       *

 		for(int i=1; i<=5; i++)
		{
		
		for(int j=1; j<=5;j++)
		{
	 	if(j==1 || j==5 || j==6-i || j==i )
			{
			System.out.print("* ");
			}
			else
			{
			System.out.print("  ");
			}
		}
		System.out.println();
	}

	
	*/


/*


* * * * *
      *
    *
  *
* * * * *



		for(int i=1; i<=5; i++)
		{
		
		for(int j=1; j<=5;j++)
		{
	 	if(i==1 || i==5 || j==6-i)
			{
			System.out.print("* ");
			}
			else
			{
			System.out.print("  ");
			}
		}
		System.out.println();
	}



*/


/*


* * * * *
    *
    *
    *
    *





	for(int i=1; i<=5; i++)
		{
		
		for(int j=1; j<=5;j++)
		{
	 	if(i==1 || j==3)
			{
			System.out.print("* ");
			}
			else
			{
			System.out.print("  ");
			}
		}
		System.out.println();
	}


*/


/*



* * * * *
    *
    *
    *
* * * * *

for(int i=1; i<=5; i++)
		{
		
		for(int j=1; j<=5;j++)
		{
	 	if(i==1 || j==3 || i==5)
			{
			System.out.print("* ");
			}
			else
			{
			System.out.print("  ");
			}
		}
		System.out.println();
	}


*/


/*

 	*
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *


for(int i=1; i<=5; i++)
		{
		for(int k=5; k>i;k--)
		{
		System.out.print("  ");
		}
		
		for(int j=1; j<=2*i-1 ;j++)
		{
	 	System.out.print("* ");
		}
		System.out.println();
	}


		int m=1;

	for(int i=1; i<=5; i++)
		{
		for(int k=5; k>i;k--)
		{
		System.out.print("  ");
		}
		
		for(int j=1; j<=m ;j++)
		{
	 	System.out.print("* ");
		}
		System.out.println();
		m+=2;
	}

*/
/*

*********
 *******
  *****
   ***
    *


	for(int i=5; i>=1; i--)
		{
		for(int k=5; k>i;k--)
		{
		System.out.print("  ");
		}
		
		for(int j=1; j<=2*i-1 ;j++)
		{
	 	System.out.print("* ");
		}
		System.out.println();
	}




	

		int n=5;	
	int m=2*n;

	for(int i=1; i<=n; i++)
		{
		for(int k=1; k<i;k++)
		{
		System.out.print("  ");
		}
		
		for(int j=1; j<m ;j++)
		{
	 	System.out.print("* ");
		}
		System.out.println();
		m-=2;
	}


*/



/*

*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*






for(int i=5; i>=1; i--)
	{	
		for(int j=5; j>=i; j--)
		{	
		    System.out.print("* ");
		}


	System.out.println();

	}
	for(int i=1; i<=5; i++)
	{	
		for(int j=5; j>i; j--)
		{	
		    System.out.print("* ");
		}
	System.out.println();
	}

	

	OR



	int n=5;
	int k =1;
	
	for (int i =1; i<2*n; i++)
	{ 
		for(int j=1; j<=k;j++)
		{
		  System.out.print("* ");
		}
	System.out.println();

	if(i<n){
	k++;
	}
	else
	{ 
	k--;
	}
	}




Q.     *
      **
     ***
    ****
   *****
    ****
     ***
      **
       *









int n=5;
int y=n;
int k=1;
for(int i=1;i<2*n ;i++)
{
	
	for(int j=1;j<y; j++)
	{
		System.out.print("  ");
	}
	
	
	for(int l=1;l<=k;l++)
	{
	System.out.print("* ");
	}
	if(i<n)
	{
		y--;
		k++;
	}
	else{
	y++;
	k--;
	}
	
	System.out.println();
}


*/

/*

Q.      *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *


int n=5;
int y=n;
int k=1;
for(int i=1;i<2*n ;i++)
{
	
	for(int j=1;j<y; j++)
	{
		System.out.print("  ");
	}
	
	
	for(int l=1;l<=k;l++)
	{
	System.out.print("* ");
	}
	if(i<n)
	{
		y--;
		k+=2;
	}
	else{
	y++;
	k-=2;
	}
	
	System.out.println();
}

*/


/*

* * * * *
* * * *
* * *
* *
*
* *
* * *
* * * *
* * * * *




int n=5;
int y=n;
for(int i=1;i<2*n ;i++)
{
	
	for(int j=1;j<=y; j++)
	{
		System.out.print("* ");
	}
	
	
	
	if(i<n)
	{
		y--;
	
	}
	else{
	y++;
	
	}
	
	System.out.println();
}




*/

/*

int n=5;
int space=0;

for(int i=1;i<=2*n;i++)
{
	for(int j=1;j<space;j++)
	{
	System.out.print(" ");
	}
	for(int k=2*n-1;k<1;k--)
	{
	System.out.print("* ");
	}
if(i<5)
{
space++;
k--;
}else
{
space--;
k++;
}
	System.out.println();
}
	
*/

/*


* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *


	int n=5;
	int star=n;
	int space=1;
	for(int i=1; i<2*n; i++)
	{
	for(int j =1; j<space ; j++)
	{
	System.out.print("  ");
	}
	for(int j=1; j<2*star;j++)
	{
	System.out.print("* ");
	}
if(i<n)
{
star--;
space++;}
else
{
star++;
space--;
}
System.out.println();
}
\
*/

/*

* * * * *
  * * * *
    * * *
      * *
        *
      * *
    * * *
  * * * *
* * * * *



int n=5;
int star=n;
int space=1;
for(int i=1;i<2*n;i++)
{
	for(int j=1;j<space;j++)
	{
	System.out.print("  ");
	}
	for(int k=1;k<=star;k++)
{
	System.out.print("* ");
	}
	if(i<n)
{
	space++;
	star--;
}
else
{
	space--;
	star++;
}
System.out.println();
}

*/
/*

*               *
* *           * *
* * *       * * *
* * * *   * * * *
* * * * * * * * * *
* * * *   * * * *
* * *       * * *
* *           * *
*               *

*/

int n=5;
int space=4;
int star1=1;;
for(int i=1;i<2*n;i++)
{	
	for(int k=1;k<=star1;k++)
	{
	System.out.print("* ");
	}
	
	for(int j=1;j<2*space;j++)
	{
	System.out.print("  ");
	}
	
	for(int m=1;m<=star1;m++)
	{
	if()j==n)
	{
	}
	else{
	
	System.out.print("* ");
	}}
	if(i<n)
	{
	space--;
	star1++;
	}
	else
	{
	space++;
	star1--;
	}
	System.out.println();
	}






	




   }
}











