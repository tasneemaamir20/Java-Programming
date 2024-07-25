import java.util.Scanner;

public class StringPracticeDay2 {
    public static void main(String[] args) {
        // ! q1. convert a string to uppercase without inbuilt method.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the String");
        // String str = sc.nextLine();
        // String s2 = "";
        // char ch;
        // for (int i = 0; i < str.length(); i++) {
        // ch = str.charAt(i);
        // if (ch >= 'a' && ch <= 'z') {
        // s2 += (char) (ch - 32);
        // } else {
        // s2 += ch;
        // }
        // }
        // System.out.println(s2);

        // ! Q2. WAJP to to count the number of words in a sentence
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the String");
        // String str = sc.nextLine();
        // int count = 0;
        // for (int i = 0; i < str.length(); i++) {

        //     if (str.charAt(i) == ' ' && str.charAt(i+1)!=' ') {
        //         count++;
        //     } else if (i == 0 && str.charAt(i)!=' ') {
        //         count++;
        //     }
        // }
        // System.out.println("Number of words=>" + count);

        // ! Q3. Take a String input and count no of char present with even ascii value
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the string");
        // String str = sc.nextLine();
        // char ch;
        // int count=0;
        // for (int i = 0; i < str.length(); i++) {
        //     ch = str.charAt(i);
        //     if (ch % 2 == 0) {
                    // count++;   
        //         System.out.println(ch+"=> charracter have even ascii value");
        //     }
        // }
        
        // ! Q4. print first half pf string in upper case and second half in lower case
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the String ");
        // String str = sc.nextLine();
        // String s2 = "";
        // char ch;
        // for (int i = 0; i < str.length() / 2; i++) {
        //     ch = str.charAt(i);
        //     if (ch >= 'a' && ch <= 'z') {
        //         s2 += (char) (ch - 32);
        //     }else{
        //         s2+=ch;
        //     }

        // }
        // for (int i = str.length() / 2; i < str.length(); i++) {
        //     ch = str.charAt(i);
        //     if (ch >= 'A' && ch <= 'Z') {
        //         s2 += (char) (ch + 32);
        //     } else {
        //         s2 += ch;
        //     }
        // }
        // System.out.println(s2);

        // ! Q5. Print if char is in odd index make it as lowercase and if the char is in even index then make it as uppercase.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the String ");
        // String str = sc.nextLine();
        // String s2 = "";
        // char ch;
        // for (int i = 0; i < str.length(); i++) {
        //     ch = str.charAt(i);
        //     if (i % 2 == 0) {
        //         if (ch >= 'a' && ch <= 'z') {
        //             s2 += (char) (ch - 32);
        //         } else {
        //             s2 += ch;
        //         }
        //     } else if (i % 2 != 0) {
        //         if (ch >= 'A' && ch <= 'Z') {
        //             s2 += (char) (ch + 32);
        //         } else {
        //             s2 += ch;
        //         }
        //     }
        // }
        // System.out.println(s2);
    }
}
