public class jh {
    public static void main(String[] args) {
        int arr[] = {9,7,6,4,2,3,5, 0, 1 };
        int sum = 0;
        for (int i = 0; i <arr.length; i++) {
            sum += arr[i];
        }
        int n = arr.length;
        int totalArray = n * (n + 1) / 2;
        System.out.println(totalArray-sum);

    }
    }

