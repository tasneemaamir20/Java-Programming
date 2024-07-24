import java.util.Scanner;

class StringPractice {
    public static void main(String[] args) {
        // ! 1. WAJP to reverse a String
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the stirng");
        // String s = sc.nextLine();
        // String newString = "";
        // for(int i=s.length()-1;i>=0;i--)
        // {
        // char ch = s.charAt(i);
        // newString += ch;
        // }
        // System.out.println(newString);

        // ! 2. Write a java program to store a sentence. Print only the first character
        // of all the words.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the stirng");
        // String s = sc.nextLine();
        // char ch;

        // for (int i = 0; i <= s.length()-1; i++) {
        // if (s.charAt(i) == ' ') {
        // System.out.println(s.charAt(i+1));
        // }else if(i==0){
        // System.out.println(s.charAt(i));
        // }

        // }

        // ! Q3. Take a char array and convert it to String and print it.
        // char ch[] = { 'a', 'a', 'm', 'i', 'r' };
        // String str = "";
        // for (int i = 0; i <= ch.length-1; i++) {
        // str += ch[i];
        // }
        // System.out.println(str);

        // ! Q4. convert the string to char
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the stirng");
        // String s = sc.nextLine();
        // char ch[] = new char[s.length()];
        // for (int i = 0; i <= s.length() - 1; i++) {
        // ch[i] += s.charAt(i);
        // }

        // for (int i = 0; i <= ch.length - 1; i++) {
        // System.out.print(ch[i] + ",");
        // }

        // ! Q5.Take a string input from user and count upper case, lower case, and
        // numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stirng");
        String s = sc.nextLine();
        int lowerCase = 0, upperCase = 0, number = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                upperCase++;
            } else if (c >= 'a' && c <= 'z') {
                lowerCase++;
            } else if (c >= '0' && c <= '9') {
                number++;
            } 

        }
        System.out.println("Uppercase=>" + upperCase  );
        System.out.println("lowercase=>" + lowerCase);
        System.out.println("number=>" + number);
    }
}