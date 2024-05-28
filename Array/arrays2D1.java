import java.util.Scanner;

class arrays2D1
{

public static void main(String[]args)
{	



/* 
print martrix in spiral form
*/


	int arr[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
	
	int 


































/*
transpose of matrix

	int arr[][]={{1,3,5},{2,9,8},{3,4,5}};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			int temp=arr[i][j];
			arr[i][j]=arr[j][i];
			arr[j][i]=temp;
		}
		

	}
*/

for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr.length;j++)
{
	System.out.print(arr[j][i]);
}
System.out.println();
}



















/* 
sum of column

	int arr[][]={{1,2,3},{2,3,4},{3,4,5}};
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			
				sum=sum+arr[i][j];
			}
			System.out.println(sum);
			sum=0;
			
		
	}
	
*/
































/*
print the upper trangular part of the matrix 
	
	int arr[][]={{2,3,6,5},{4,4,8,9},{1,2,8,7},{0,1,2,5}};
		
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(i<=j)
			{
			System.out.print(arr[i][j]+" ");	
			}	
			else
			{
				System.out.print(0+" ");
			}
			
		}
		System.out.println();
	}



*/














/*
print the lower trangular part of the matrix 


	
	int arr[][]={{2,3,6,5},{4,4,8,9},{1,2,8,7},{0,1,2,5}};
		
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(i>=j)
			{
			System.out.print(arr[i][j]+" ");	
			}	
			else
			{
				System.out.print(0+" ");
			}
			
		}
		System.out.println();
	}


*/






















	/*
	check matrix is indentity or not
	
	int arr1[][]={{1,0,0,0},{0,1,0,0,},{0,0,1,0},{0,0,0,1}};
	
	if(arr1.length==arr1[0].length)
	{  
		boolean flag=true;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
			{
			 
				if(i==j && arr1[i][j]!=1)
				{
					flag=false;
					break;
				}	
				if(i!=j && arr1[i][j]!=0)
				{
					flag=false;
					break;
				}
			
			}

			
		}
		if(flag==true)
		{
			System.out.println("the matrix is identity");
		}
		else
		{
			System.out.println("the matrix is not identity");
		}
	}	
	

*/
				

















	/*
	 substraction of 2D matrix
	int arr1[][]={{2,1,4,3},{10,5,9,6},{9,7,8,6},{5,4,3,2}};
	int arr2[][]={{1,1,2,3},{1,5,7,6},{8,5,3,4},{1,2,2,1}};
	int arr[][]=new int[4][4];
	
	for(int i=0;i<arr1.length;i++)
	{	
		
		for(int j=0;j<arr1.length;j++)
		{
			arr[i][j]=arr1[i][j]-arr2[i][j];
			System.out.print(arr[i][j]+" ");
			

		}
		System.out.println();
		
		
	}
	
	*/













	/*
	addition of 2 2D matrix
	int arr1[][]={{2,1,0,3},{10,5,0,6},{9,7,8,6},{5,4,3,2}};
	int arr2[][]={{1,1,2,3},{1,5,7,6},{8,5,3,4},{9,8,7,6}};
	int arr[][]=new int[4][4];
	
	for(int i=0;i<arr1.length;i++)
	{	
		
		for(int j=0;j<arr1.length;j++)
		{
			arr[i][j]=arr1[i][j]+arr2[i][j];
			System.out.print(arr[i][j]+"");
			

		}
		System.out.println();
		
		
	}

	*/













	
	/*
	minimum values in a every row
	int arr[][]={{2,1,0,3},{10,5,0,6},{9,7,8,6}};
	for(int i=0;i<arr.length;i++)
	{	
		int min=arr[i][0];
		for(int j=0;j<arr[i].length;j++)
		{
			if(arr[i][j]<min)
			{
			min=arr[i][j];
			}
		}	
		
		System.out.println(min);
		
	}
	*/













	
	/*
	Q4. WAP to create a 2D array and find max of all element.
	int arr[][]={{2,1,0,3},{10,5,0,6},{9,7,8,6}};
	for(int i=0;i<arr.length;i++)
	{	
		int max=arr[i][0];
		for(int j=0;j<arr[i].length;j++)
		{
			if(arr[i][j]>max)
			{
			max=arr[i][j];
			}
		}	
		
		System.out.println(max);
		
	}


*/











	/*
	Q6. WAP to create a 2D array and find the occurance of even element.
		int arr[][]={{7,1,3,2},{4,8,3,5},{8,5,9,7}};
	int evenCount=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			if(arr[i][j]%2==0)
			{
			evenCount++;
			}
			
		}
		if(evenCount>0)
		{	
		System.out.println(evenCount);
		evenCount=0;
		}
		else
		{
		System.out.println("no even number in an array");
		}
	}
	*/
	

/*


	Q7. WAP to create a 2D array and find the occurance of odd element.
	int arr[][]={{7,1,3,2},{4,8,3,5},{8,5,9,7}};
	int oddCount=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			if(arr[i][j]%2!=0)
			{
			oddCount++;
			}
			
		}
		if(oddCount>0)
		{	
		System.out.println(oddCount);
		oddCount=0;
		}
		else
		{
		System.out.println("no even number in an array");
		}
	}


*/

	
}

}