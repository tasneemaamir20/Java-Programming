class recurD1
{
public static int display()
{	
	int n;
	int sum=0;
	if(n<0)
	{
		return 0;
	}
	else
	{
		return sum=n+sum(n-1);
	}
}
public static void main(String[]args)
{
display(5);
}
}