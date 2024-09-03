public class ArrayPracticesept {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13 };
        boolean flag = true;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] + arr[i + 1] != arr[i + 2]) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("This is febonacci series");
        } else {
            System.out.println("this is not febonacci series");
        }
    }
}
