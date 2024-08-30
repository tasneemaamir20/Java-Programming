public class Aug30 {
    public static void main(String[] args) {
        int l1[] = { 2, 4, 3 };
        int l2[] = { 5, 6, 4 };
        int n = 0;
        int m = 0;
        int sum=0;
        for (int i = l1.length - 1; i >= 0; i--) {
            n = n * 10 + l1[i];
        }
        for (int i = l2.length - 1; i >= 0; i--) {
            m = m * 10 + l2[i];
        }
        // int reverseNumber = n;
        sum = n + m;
        int i = -1;
        int output[] = new int[l1.length];
        while (sum > 0) {
            output[++i] = sum % 10;
            sum = sum / 10;
        }
        System.out.println(sum);
        for (int j = 0; j < output.length; j++) {
            System.out.print(output[j]+",");
        }
    }
}
