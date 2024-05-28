class recurD2
{
/*
Q1.

public static void print(int n)
{
	if(n==1)
	{
	System.out.print(1);
	}
	else if(n<=0)
	{
	System.out.print("not a natural number");
	}
	else
	{
	print(n-1);
	System.out.print(n);
	
	}
}
public static void main (String[]args)
{
	
	print(5);

}


*/




/*
Q2.

public static void print(int n)
{
	if(n==1)
	{
	System.out.print(1);
	}
	else if(n<=0)
	{
	System.out.print("not a natural number");
	}
	else
	{
	
	System.out.print(n);
	print(n-1);
	}
}
public static void main (String[]args)
{
	
	print(5);

}




*/



/*
Q3.
*/


public static void even(int n)
{
	if(n==0)
	{
		System.out.print(n+",");
	}
	else if(n<0)
	{
		
		System.out.print("invalid");
	}
	else
	{
		if(n%2==0)
		{
			even(n-2);
			System.out.print(n+",");
		}
		else
		{
			even(n-1);
		}
	}
}
public static void main (String[]args)
{
	
	even(9);

}











}