import java.util.Scanner;

public class PracticeArray {
    public static void main(String[] args) {
        // int target=10;
        // int arr[]={2,7,3,4,6,8,9,11,0};
        // for(int i=0;i<arr.length;i++)
        // {
        // for(int j=i+1;j<arr.length;j++)
        // {
        // if(arr[i]+arr[j]==target)
        // {
        // System.out.println("First index : "+ i +"Second index"+ j);
        // }
        // }
        // }

        // String []arr={"a","b","b","c","c","c","d","d","d","d"};
        // int count=1;
        // for(int i=0;i<arr.length;i++)
        // {
        // for(int j=i+1;j<arr.length;j++)
        // {
        // if(arr[i].equals(arr[j]))
        // {
        // count++;
        // }
        // System.out.println(arr[i]+" " +count);
        // }
        // }

        // ! ===== 3========
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // String [] charac = new String[size];
        // for(int i=0;i<size;i++)
        // {
        // charac[i] = sc.nextLine();
        // }
        // for (int j = 0; j < size; j++)
        // {
        // System.out.println(charac[j]);
        // }
        // !=========== 4 ============
        // String[] songs = { "Humdum", "Awara", "Ruaan", "Wareyan", "295" };
        // String s = "Ruaan";
        // boolean b = true;
        // for(int i=0;i<songs.length;i++)
        // {
        // if (songs[i].equals(s)) {
        // b = false;
        // System.out.println("The " + s + " is at index:" + i);
        // break;
        // }
        // }
        // if(b)
        // {
        // System.out.println("Not present");
        // }

        // ! =========== 5 ============
        // int[] arr = { 45, 15, 12, 43, 12, 34, 61, 87 };
        // int max = arr[0];
        // int min = arr[0];
        // for (int i = 0; i < arr.length; i++) {
        // if(arr[i]>max)
        // {
        // max = arr[i];
        // }
        // if (arr[i] < min) {
        // min = arr[i];
        // }
        // }
        // System.out.println("Maximum number in an array :"+max);
        // System.out.println("Minimum number in an array :"+min);

        // !============= 6 ==========
        // int[] arr = { 45, 15, 12, 43, 12, 34, 61, 87 };
        // int first = arr[0];
        // int second = 1;
        // for(int i=0;i<arr.length;i++)
        // {
        // if (arr[i] > first) {
        // second = first;
        // first = arr[i];
        // }
        // }
        // System.out.println("First Biggest number : "+first);
        // System.out.println("Second Biggest number : "+second);

        // !======= 7 =============
        // int[] arr = { 10, 20, 30, 40, 60, 20, 90, 100 };
        // int target = 20;
        // boolean isFound = true;
        // for (int i = 0; i < arr.length; i++) {
        // if (target == arr[i]) {
        // isFound = false;
        // }
        // }
        // if (isFound) {
        // System.out.print("No !! Not Found");
        // } else {

        // System.out.print("Yes" + target + "have a two occurance");
        // }

        // !============== 8 ============
        // int[] arr = { 10, 20, 30, 40, 60, 20, 90, 100 };
        // int k = 1;
        // int count = 0;
        // int element = arr[k];
        // for (int i = 0; i < arr.length; i++) {
        // if (element == arr[i]) {
        // count++;
        // }
        // }
        // k++;
        // System.out.println(element + " occurs " + count + " times ");

        // !========== 9 ===============
        // int arr[] = { 1, 2, 3, 5, 7, 9 };
        // int a = arr[0];
        // for (int i = 0; i < arr.length; i++) {
        // if (a != arr[i]) {
        // System.out.println(a + " is missing");
        // }
        // a++;
        // }

        // !==================10 ==============
        // ! number frequency
        // int[] arr = { 0, 1, 2, 3, 2, 0, 2, 4, 3, 5, 2 };
        // int[] visited = new int[arr.length];

        // for (int i = 0; i < arr.length; i++) {
        // int count = 0;
        // boolean isVisited = false;
        // for (int j = 0; j < visited.length; j++) {
        // if (arr[i] == visited[j]) {
        // isVisited = true;
        // }
        // }
        // if (isVisited) {

        // } else {
        // for (int j = 0; j < arr.length; j++) {
        // if (arr[i] == arr[j]) {
        // count++;
        // }
        // }
        // System.out.println(arr[i] + "occurs" + count + "times");
        // visited[i] = arr[i];
        // }

        // }

        // !=================== 11 =================
        // ! left rotate
        // int[] arr = { 1, 2, 3, 4, 5 };
        // // ?enter number of times an array should be rotated
        // int n = 2;

        // // ? DIsplay original array
        // System.out.println("Original array");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + ",");
        // }

        // // ? rotate the given array by n times
        // for (int i = 0; i < n; i++) {
        // int first = arr[0];
        // for (int j = 0; j < arr.length - 1; j++) {
        // arr[j] = arr[j + 1];
        // }
        // arr[arr.length - 1] = first;
        // }
        // System.out.println();
        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i]+",");
        // }

        // ! =========== right rotate =============
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int n = 2;
        // System.out.println("original array");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + ",");
        // }

        // // ? right rotate
        // for (int i = 0; i < n; i++) {
        // int last = arr[arr.length-1];
        // for (int j = arr.length-2; j >= 0; j--) {
        // arr[j + 1] = arr[j];
        // }
        // arr[0] = last;
        // }
        // System.out.println();
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i]+",");
        // }

        // !== print duplicate ==============
        // int[] arr1 = { 1, 2, 3, 4, 5 };
        // int[] arr2 = { 3, 4, 5, 6, 7, 8 };

        // System.out.println(" first Array ");
        // for (int i = 0; i < arr1.length; i++) {
        // System.out.print(arr1[i] + ",");
        // }
        // System.out.println();
        // System.out.println("Second array");
        // for (int i = 0; i < arr2.length; i++) {
        // System.out.print(arr2[i] + ",");
        // }
        // System.out.println();
        // System.out.println("Duplicate");
        // for (int i = 0; i < arr1.length; i++) {
        // boolean common = false;
        // for (int j = 0; j < arr2.length; j++) {
        // if (arr1[i] == arr2[j]) {
        // common = true;
        // }
        // }
        // if (common) {
        // System.out.print(arr1[i]+",");
        // }
        // }

        // ! =============== Bubble sort =================
        // int[] arr = { 1, 5, 3, 2, 6, 7, 4 };
        // System.out.println("Original array");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + ",");
        // }

        // // ?sorting array
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length - 1 - i; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }
        // System.out.println();
        // System.out.println("sorted array");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+",");
        // }

        // !=============== selection sort ================
        // int[] arr = { 4, 1, 5, 8, 2, 9, 6, 7, 3, 0 };

        // System.out.println("original array");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + ",");
        // }

        // // ?sorting array
        // for (int i = 0; i < arr.length - 1; i++) {
        //     int small = i;
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[small] > arr[j]) {
        //             small = j;
        //         }
        //     }
        //     int temp = arr[small];
        //     arr[small] = arr[i];
        //     arr[i] = temp;
        // }
        // System.out.println();
        // System.out.println("sorted array");
        // for (int j : arr) {
        //     System.out.print(j+",");
        // }

        //!============== insertion sort  =================
        int[] arr = { 4, 1, 5, 8, 2, 9, 6, 7, 3, 0 };

        System.out.println("original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        //? sorting array
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.println("sorted array");
        for (int j : arr) {
            System.out.print(j+",");
        }

    }
}
