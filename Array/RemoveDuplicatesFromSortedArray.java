import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

public static void main (String args[]){



int nums[]=new int [10];
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int size=s.nextInt();
System.out.println("enter the size of array");

for(int i=0;i<nums.length())	
{
nums[i]=s.nextInt();
int res=removeDupli();
System.out.print(res);
}

public static int removeDupli(int[] nums){


int count=0;
       
       for(int i =0;i<nums.length;i++){
        if(i<nums.length-1&& nums[i]==nums[i+1]){
continue;
}
            
           nums[count]=nums[i];
count++;
            }
return count;
        
        
    }

}
}