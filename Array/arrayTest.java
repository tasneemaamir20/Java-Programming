import java.util.Scanner;
 class arraysTest{



// Q 1. right shift to k step 
// public static void main(String[]args){
// // Initialize array
//         int [] arr = {1, 2, 3, 4, 5,6,7};
//         //enter number of times an array should be rotated
//         int n = 3;
//         //Displays original array
//         System.out.println("Original array: ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + "  ");
//         }
//         //Rotate the given array by n times toward right
//         for(int i = 0; i < n; i++){
//             //Stores the first element of the array
//             int last = arr[arr.length-1];
//             for(int j = arr.length-2; j >= 0 ; j--){
//                 //Shift element of array by one
//                 arr[j+1] = arr[j];
//             }
//             //Last element of array will be added in the starting
//             arr[0] = last;
//         }
//         System.out.println();
//         //Displays resulting array after rotation
//         System.out.println("Array after left rotation: ");
//         for(int i = 0; i< arr.length; i++){
//             System.out.print(arr[i] + "  ");
//         }
// }

// 
public static void main(String[] args) {
    

        int[] arr = {3,3};
        int target = 6;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i + ", " + j);
                }
            }
        }
 }
}


