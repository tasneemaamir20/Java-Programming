import java.util.Scanner;

public class Wrapperclass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer arr[] = new Integer[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value:");

            String s = sc.next();
            Integer x = Integer.parseInt(s);
            arr[i] = x;
        }

        int pro = 1;
        for (int i = 0; i < arr.length; i++) {
            int data = arr[i].intValue();
            pro *= data;
        }
        System.out.println(pro);

    }
}