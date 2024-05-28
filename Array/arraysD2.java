import java.util.*;

class arraysD2
{
public static void main(String[]args)
{

/*
q1. Sum of odd 
int arr[]={11,12,13,14,15,16};

int sum=0;
for(int i=0;i<arr.length;i++)
{
 if(arr[i]%2!=0)
{
sum =sum + arr[i];
}

}
System.out.println("sum of odd number:"+ sum);
*/


/*
Q2. reverse the arrays using another array.

int arr[]={11,12,13,14,15,16};




int arr1[]=new int[arr.length];
int j =0;
for(int i=arr.length-1;i>=0;i--)
{
	arr1[j]=arr[i];
	j++;
}
System.out.println(Arrays.toString(arr1));
*/




/*

Q3. Reverse the  array without using another array.




int arr[]={11,12,13,14,15,16};
int j=arr.length-1;
for(int i=0;i<arr.length/2;i++)
{
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	j--;
}
System.out.println(Arrays.toString(arr));

*/

/*

Q4. 
WAP to find  the biggest and smallest number in an array


int arr[]={11,12,13,14,15,16};
int j=0;
for(int i=0;i<arr.length;i++)
{
	if(arr[j]<arr[i])
	{
	arr[i]=arr[j];
	j++;
	}
}
System.out.println(Arrays.toString(arr));




*/




/*
Q5. 
WAP to search the element in an array


String fruits[]={"Apple","orange","Mango","Banana","papaya","guava","avacado","grapes"};
String target="Mango";
boolean flag=false;


for(int i=0;i<fruits.length;i++)
{
	if(fruits[i].equals(target))
	{
		flag=true;
		System.out.println(target+" is present");
		break;
	}
}
	if(flag==false)
{
System.out.println(target+"is not present");
}

*/
/*
Q11. WAP to find second occurance eleemnt in an array

int no[]={10, 20, 30, 40,60, 20,90,100};

int target=20;
int count=0;
for(int i =0; i<no.length;i++)
{
	if(no[i]==target)
	{
	count++;
	if(count==2)
{
System.out.print(i);
}
	}

	}
*/

/*
Q12.  WAP to find how many times an element occured in an array

int no[]={10, 20, 30, 40,60, 20,90,100};

int target=20;
int count=0;
for(int i =0; i<no.length;i++)
{
	if(no[i]==target)
	{
	count++;
	}
	}
System.out.print(target +" is occur "+count+" times");


*/

/* 
Q WAP to display the index of sum of 2 element .
int target=10;
int arr[]={2,7,3,4,6,8,9,11,0};

for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
	if(arr[i]+arr[j]==target)
	{
	System.out.println("the first element index is "+ i+" second element index is "+j);

	
	}

	}
}



*/
 /*
Q WAP to find highest contigous sum 


int arr[]={2,7,3,4,6,8,9,11,0};
int highest=arr[0]+arr[1];
for(int i=0;i<arr.length-1;i++)
{
	if(arr[i]+arr[i+1]>highest)
	{
		highest=arr[i]+arr[i+1];
	}
}
System.out.println("highest contigous sum: "+  highest);

*/

/* 
Q 13. WAP to find the missing number in given array with given range.

int s=1;
int l=20;
int j=0;
int arr[]={3,5,9,12,16,19};


for(int i=s;i<=l;i++)
{
	
        if(j<arr.length&&i==arr[j])
	{
	j++;
	}
	else{
	System.out.print(i+" , ");
	}
}
*/

/*
Q 18. WAP to merge a two array

int arr1[]={1,2,3,4,5};
int arr2[]={6,7,8,9,10};
int j=0;
int arr3[]=new int[arr1.length+arr2.length];

for(int i=0;i<arr3.length;i++ )
{
	if(i<arr1.length)
	{
	arr3[i]=arr1[j];
	j++;
	}
	else
	{
	arr3[i]=arr2[j-arr1.length];
	j++;
	}	
	System.out.print(arr3[i] + ",");
}


*/

/*
D16. WAP to change the first part of element to a second part of element.

int a[]={10,20,30,40,50,60,70};
int j=0;
if(a.length%2==0)
{
j=a.length/2;
}
else
{
j=a.length/2+1;
}

for(int i=0;i<a.length/2;i++)
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
j++;
}
System.out.print(Arrays.toString(a));


*/

/*
WAP to print distinct number from two given array.

1. using boolean value outside loop

int a[]={2,4,1,7,5,3};
int b[]={1,2,3};
boolean flag=false;
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<b.length;j++)
	{
		if(a[i]==b[j])
		{
			flag=true;
		}
	}
	
	if(flag==false)
	{
		System.out.println(a[i]);
	}
	flag=false;

}


		   -----------
		   |	OR   |
		   -----------

2.using boolean value inside loop

int a[]={2,4,1,7,5,3};
int b[]={1,2,3};

for(int i=0;i<a.length;i++)
{
	boolean flag=false;
	for(int j=0;j<b.length;j++)
	{
		if(a[i]==b[j])
		{
			flag=true;
		}
	}
	
	if(flag==false)
	{
		System.out.println(a[i]);
	}
	

}
*/
/* 

Q WAP to merge two array in a zigzag manner.

int a[]={2,4,1,7,5,3};
int b[]={1,2,3,4,5,6};

int x=0;
int y=0;
int c[]=new int[a.length+b.length];

for(int i=0;i<c.length;)
{
	
	if(x<a.length)
	{
		c[i]=a[x];
		x++;
		i++;	
	}

	if(y<b.length)
	{
		c[i]=b[y];
		y++;
		i++;
	}
	
}

System.out.print(Arrays.toString(c));

*/
/*
Q 27 bubble sort
// */
//      int a[]={40,30,50,10,80};
	
//      for (int i=0;i<a.length;i++)
//      {
//        int count=a.length;
// 	for(int k=i;k<count;k++)
// 	{
// 	  if(a[i]>a[k])
//          {
//              int temp=a[i];
//              a[i]=a[k];
//              a[k]=temp;
	     
//          }
         
//          }
// 	count--;
//      }

// for(int j=0;j<a.length;j++)
// {
// System.out.print(a[j]+" , ");
// }


// Q 28.  selection sort


	int a[]={50,30,60,40,10};
	
	int min=a[0];
	int k=0;
	for (int i=0;i<a.length;i++)
	{	
		
		
		for(int j=i;j<a.length;j++)
		{
			
			if(a[i]>a[j])
			{
				 min=a[j];
				k=j;
			}
			
		}
				int temp=a[i];
				a[i]=min;
				a[k]=temp;
	}
for(int z=0;z<a.length;z++ )
{
System.out.print(a[z]+" , ");
}
}
}