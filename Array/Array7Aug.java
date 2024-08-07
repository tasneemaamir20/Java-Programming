import java.util.Arrays;

public class Array7Aug {
    // ! square the element and sort the array
    public static void main(String[] args) {
        int arr[] = { -8, -3, 1, 3, 9 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = (arr[i] * arr[i]);
        }

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n - 1; k++) {
                if (arr[k] > arr[k + 1]) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }
        // Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
