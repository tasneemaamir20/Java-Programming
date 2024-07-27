import java.util.Scanner;

public class StringPracticeDay3 {
    public static void main(String[] args) {
        // ! Q1.Write a program to find the sum of numbers in an ALPHA NUMERIC STRING.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the String");
        // String str = sc.nextLine();
        // int sum = 0;
        // char ch;
        // for (int i = 0; i < str.length(); i++) {
        // ch = str.charAt(i);
        // if (ch >= '0' && ch <= '9') {
        // sum +=(int) (ch-48);
        // }
        // }
        // System.out.println("Sum of alpha numeric values in given String=> " + sum);

        // ! Q2. WAP to print frequency of each character in a string.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the String");
        // String str = sc.nextLine();
        // String visited = "";
        // for (int i = 0; i < str.length(); i++) {
        // int count = 0;
        // char ch = str.charAt(i);
        // if (!visited.contains(ch + "")) {
        // for (int j = 0; j < str.length(); j++) {
        // if (str.charAt(j) == ch) {
        // count++;
        // }
        // }
        // System.out.println(ch + "-" + count);
        // visited += ch;
        // }
        // }

        // ! Q3. WAP to print maximum occuering character in a string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String visited = "";
        for (int i = 0; i < str.length(); i++) {
            int max = 0;
            int count = 0;
            char ch = str.charAt(i);
            if (!visited.contains(ch + "")) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) {
                        count++;
                    }
                }
                if (max < count) {
                    max = count;
                }
                System.out.println(ch + "" + max);
                visited += ch;
            }
        }
    }
}
