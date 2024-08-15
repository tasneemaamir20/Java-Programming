public class NumberProgramDay3 {
    // ! WRITE A JAVA PROGRAM TO FIND WHETHER THE NUMBER IS BUZZ OR FIZZ OR BOTH.IF
    // THE NUMBER IS DIVISIBLE BY 7 IT IS KNOWN AS BUZZ IF THE NUMBER ENDS WITH 7 IT
    // IS FIZZ IF BOTH BUZZ-FIZZ ELSE NITHER OF THE ABOVE

    // public static void isBuzzFizz(int n) {

    // int l = n % 10;
    // if (l == 7 && n % 7 == 0) {
    // System.out.println("this is buzz Fizz");
    // } else if (n % 7 == 0) {
    // System.out.println(" this is Buzz");
    // } else if (l == 7) {
    // System.out.println(" this is Fizz");
    // } else {
    // System.out.println(" this is nither of the above");
    // }
    // }
    // public static void main(String[] args) {
    // isBuzzFizz(77);
    // }
    // ! Q6. WRITE A JAVA PROGRAM TO FIND THE MIDDLE DIGIT OF A NUMBER. (TAKE INPUT
    // FROM USER AND NUMBER SHOULD CONTAIN ODD NUMBER OF DIGITS)

    // public static int count(int n) {
    //     int count = 0;
    //     while (n > 0) {
    //         count++;
    //         n = n / 10;
    //     }
    //     return (count-1)/2;
    // }

    // public static int middleNumber(int n) {
    //     int counter = count(n);
    //     while (counter > 0) {
    //         counter--;
    //         n = n / 10;
    //     }
    //     int middle = n % 10;
    //     return middle;
    // }

    // public static void main(String[] args) {
    //     int n = 987654321;
    //     System.out.println(middleNumber(n));
    // }

    // ! WRITE A JAVA PROGRAM TO FIND WHETHER THE NUMBER IS AUTOMORPHIC NUMBER OR NOT.IF THE SQUARE OF THE NUMBER ENDS WITH NUMBER ITSELF IS KNOWN AS NUMBER ITSELF.5-->25,25-->625,376-->141376

    // public static int squareOfNumber(int n) {
    //     return n * n;
    // }

    // public static int count(int n) {
    //     int count = 0;
    //     while (n > 0) {
    //         count++;
    //         n = n / 10;
    //     }
    //     return count;
    // }

    // public static int isAutomorphicNumber(int n) {

    //     int count = count(n);
    //     int square = squareOfNumber(n);
    //     int comparingNumber = 0;
    //     while (count > 0) {
    //         int last = square % 10;
    //         comparingNumber = last + comparingNumber * 10;
    //         square = square / 10;
    //         count--;
    //     }
    //     return comparingNumber;
    // }

    // public static int reverse(int n) {
    //     int reverseNumber = 0;
    //     int fromReverseNumber = isAutomorphicNumber(n);
    //     while (fromReverseNumber > 0) {
    //         int last = fromReverseNumber % 10;
    //         reverseNumber = (reverseNumber * 10) + last;
    //         fromReverseNumber = fromReverseNumber / 10;
    //     }
    //     return reverseNumber;
    // }
    // public static void main(String[] args) {
    //     int n = 376;
    //     System.out.println(squareOfNumber(n));
    //     System.out.println(count(n));
    //     System.out.println(isAutomorphicNumber(n));
    //     if (n == reverse(n)) {
    //         System.out.println("this is automorphic number");
    //     } else {
    //         System.out.println("this is not sutomorphic number");
    //     }
    // }
    

}
