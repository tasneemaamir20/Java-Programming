import java.util.*;
public class Test10oct
{

    public static void main(String[] args) {





/*
        // Q1. you are given a string little consisting of one or more words seperated by a single space , where 
        // each word consist of english letter capitalize the String by changing the capitalization of each word such that

        // if length of the word is 1 or 2 letters change all letters to lowercase
        // otherwise , change the first letter to uppercase and remaining ltter to lower case

        // title: "capitalize  tHe title"
        // output:"Capitalize The Title"



	String s1="capitalize the title";
	
	

	
    

     char c[]=new char[s1.length()];
    
     for(int i=0;i<s1.length();i++)
    {
        c[i]=s1.charAt(i);

	if(c[i]>='A'&&c[i]<='Z')
	
	{
		
		if(c[i]>='a' && c[i]<='z' && c[i]==' ')
		{
			c[i]=c[i+1];
		}
	}

	else
	{
	
		c[i]=(char)(c[i]-32);
	}
	c[i]=c[i+1];
System.out.print(c[i]);

	}


*/











/*


//Q5 arrray sum of to element is in the array list 

//{1,3,4,5,6,19,32,21}
//{2,19,21}
	int arr[]={1,2,3,21,4,32,54,19};
	int sum=0;
	int n=0;
	for(int i=1;i<arr.length;i++)
	{
		sum=arr[n]+arr[i];
		for(int j=0;j<arr.length;j++)
		{
			if(sum==arr[j])
			{
				System.out.println(arr[j]);
			}
		}
		
		
	}
n++;
	
	
*/
	






/*


        // q2. An array contains both positive no in random order rearrange the array element so that all the negative
        // number appears before all positive number







*/












/*


        // Q3. given n*n mtrix you have to print the element of a matrix in a snake pattern
	int Arr[][]={{1,2,3},{4,5,6},{7,8,9}};
	
	
	for(int i=0;i<Arr.length;i++)
	{
		int display;
		for(int j=0;j<Arr.length;j++)
		{
			display=Arr[i][j];
			System.out.print(display);
		}
			
	
	}
        
*/



/*
//Q 6 






	int n=5;
	int star=n;
	int space=0;
	for(int i=1; i<2*n; i++)
	{
	for(int j =1; j<space ; j++)
	{
	System.out.print(" ");
	}
	for(int j=1; j<=star;j++)
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


*/



/*

// Q7. WAP to check if the given number has an even number of digits and the number can be
// divided exactly into two parts from the middle after equally dividing the number , sum up the number and find the square of the sum it we get the number itself as square 
//3025


	/*
	public static int countDigit(int n)
	{	
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
	return count;
	}

	public static void sumOfDigit(int n)
	{	
		int sum=0;
		if(countDigit(n)%2==0)
		{
			while(n>n.length/2)
			{
			int ld=n%10;
			int m=ld;
			n=n/10;
		
			}
			int ls=n%10;
			int j=ls;
			n=n/10;
		
		int sum=j+m;
		
		}
		else
		{
			
		}

	return sum*sum;
	}
	public static boolean istechNum(int n)
	{
		int temp=n;
		if(sumOfDigit(n)==temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[]args)
	{
		
		int n=;
		int temp=n;
		System.out.print(istechNum(n));
	}


*/

/*


public static void countDigit(int a)
	{	
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
	System.out.print(count);
	}

 public static void checkTech(int a)
 {

 if(countDigit(n)%2==0)
 {

    int sc=a%100;
    int fr=a/100;
     int sum=sc+fr;

     if(a==(sum*sum))
     {
         System.out.println("this is a tech number");
    }
    else{
        System.out.println("this is not a tech numnber");
     }

    
    

 }

 else
 {
     System.out.println("this is not a tech digit");
 }
 }

     public static void main(String[] args) {
         checkTech(2025);

   }

*/



// Q8. WAP to convert decimal to binary and binary to decimal.


//main, class ends
  }
}