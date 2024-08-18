public class NumberProgramDay5 {
    // ! WRITE A JAVA PROGRAM TO FIND WHETHER THE NUMBER IS A HARSHAD NUMBER OR NOT.
    // EX: 8, 54, 156 IF THE NUMBER IS DIVISIBLE BY THE SUM OF ITS DIGITS IT IS KNOWN AS HARSHAD NUMBER.
    // public static int sumOfDigit(int n) {
    //     int sum = 0;
    //     while (n > 0) {
    //         int last = n % 10;
    //         sum = sum + last;
    //         n = n / 10;
    //     }
    //     return sum;
    // }

    // public static void main(String[] args) {
    //     int n =156;
    //     if (n % sumOfDigit(n) == 0) {
    //         System.out.println("This is Harshad Number");
    //     } else {
    //         System.out.println("This is not Harshad Number");
    //     }
    // }

    // ! WRITE A JAVA PROGRAM TO FIND WHETHER THE NUMBER IS A DUCK NUMBER OR NOT.
    // ? IF A NUMBER COINTAINS ZEROS IN IT IS CALLED AS DUCK NUMBER.() ZEROS IN BEGINING IS NOT CONSIDERED)

    // public static int biginingNumber(int n) {
    //     while (n > 10) {
    //         n = n / 10;
    //     }
    //     return n;
    // }
    //  public static void main(String[] args) {
    //      int n = 0908;
    //       System.out.println(biginingNumber(n));
    //      if (biginingNumber(n)==0) {
    //         System.out.println(" This is not Duck Number");
    //     } else {
    //         boolean flag = false;
    //         while (n > 10) {
    //             if (n % 10 == 0) {
    //                 flag = true;
    //             }
    //             n = n / 10;
    //         }
    //         if (flag) {
    //             System.out.println("this is Duck number");
    //         }
    //      }
    //  }
// ! WRITE A JAVA PROGRAM TO FIND WHETHER THE NUMBER IS A BOUNCY NUMBER OR NOT.
// ? A NUMBER WHOSE DIGITs ARE NITHER IN INCREASING ORDER NOR IN DECREASING ORDER IS CALLED AS BOUNCY NUMBER.
public static boolean isIncreasing(int n) {
    String str = Integer.toString(n);
    boolean flag = true;
    char digit;
    for (int i = 0; i < str.length()-1; i++) {
        digit = str.charAt(i);
        if (digit > str.charAt(i + 1)) {
            flag = false;
        }
    }
    return flag;
}

public static boolean isDecreasing(int n) {
    String str = Integer.toString(n);
    boolean flag = true;
    char digit;
    for (int i = 0; i < str.length()-1; i++) {
        digit = str.charAt(i);
        if (digit < str.charAt(i + 1)) {
            flag = false;
        }
    }
    return flag;
}
    public static void main(String[] args) {
        int n = 1234552;
        if (isDecreasing(n) || isIncreasing(n)) {
            System.out.println("This is not Bouncy Number");
        } else {
            System.out.println(" this is Bouncy Number");
        }
    }
}
