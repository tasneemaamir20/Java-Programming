public class NumberProgramDay4 {
    // ! WRITE A JAVA PROGRAM TO FIND WHETHER THE NUMBER IS AN ARMSTRONG NUMBER OR
    // NOT A POSITIVE NUMBER THAT IS EQUAL TO THE SUM OF Nth POWER OF THE DIGIT.( N
    // MEANS NUMBER OF DIGITS)
    // public static int count(int n) {
    // int count = 0;
    // while (n > 0) {
    // count++;
    // n = n / 10;
    // }
    // return count;
    // }

    // public static int armstrongNumber(int n) {
    // int sum = 0;
    // int power=1;
    // while (n > 0) {
    // int count = count(n);
    // int last = n % 10;
    // while (count > 0) {
    // power *= 2;
    // count--;
    // }
    // sum += power;
    // n = n / 10;
    // }
    // return power;
    // }

    // public static void main(String[] args) {
    // int n = 153;
    // System.out.println(count(n));
    // System.out.println(armstrongNumber(n));
    // if (n == armstrongNumber(n)) {
    // System.out.println("this is armstring number");
    // } else {
    // System.out.println("this is not armstrong number");
    // }
    // }
    // ! WRITE A JAVA PROGRAM TO REVERSE A NUMBER. 123-->321 (TAKE THE NUMBER
    // MULTIPLY IT WITH 10 AND ADD LAST DIGIT)
    // public static int reverse(int n) {
    // int reverse = 0;
    // while (n > 0) {
    // int last = n % 10;
    // reverse = reverse * 10 + last;
    // n = n / 10;

    // }
    // return reverse;
    // }
    // public static void main(String[] args) {
    // int n = 123;
    // System.out.println(reverse(n));
    // }
    // ! WRITE A JAVA PROGRAM TO FIND WHETHER THE NUMBER IS A MAGIC OR NOT. (EX:
    // 1458) i.e. 18 * 81 = 1458 IF THE SUM OF THE DIGITS IS MULTIPLIED WITH THE
    // REVERSED SUMIT WILLGIEV THE ORIGINAL NUMBER.
    // public static int sumOfDigit(int n) {
    //     int sum = 0;
    //     while (n > 0) {
    //         int last = n % 10;
    //         sum += last;
    //         n = n / 10;
    //     }
    //     return sum;
    // }

    // public static int reverseOfSum(int n) {
    //     int sum = sumOfDigit(n);
    //     int reverse = 0;
    //     while (sum > 0) {
    //         int last = sum % 10;
    //         reverse = reverse * 10 + last;
    //         sum = sum / 10;

    //     }
    //     return reverse;
    // }

    // public static void main(String[] args) {
    //     int n = 1458;
    //     if (sumOfDigit(n) * reverseOfSum(n) == n) {
    //         System.out.println("this is magic number");
    //     } else {
    //         System.out.println("this is not magic number");
    //     }
    // }

// ! WRITE A JAVA PROGRAM TO FIND WHETHER THE NUMBER IS AN ADAM NUMBER OR NOT.
//? (EX: 0, 1, 2, 3, 11, 12, 13, 21, 22, 31, 101, 102, 103, 111, 112 , 113)IF THE SQUARE OF THE NUMBER AND THE SQUARE OF THE REVERSE OF THE NUMBER ARE NUMBERS THAT ARE REVERSE OF EACH OTHER.
public static int reverseOfNumber(int n) {
    int m = n * n;
    int reverse = 0;
    while (m > 0) {
        int last = m % 10;
        reverse = reverse * 10 + last;
        m = m / 10;
    }
    return reverse;
}

public static int squareOfReverseNumber(int n) {
    int reverse = 0;
    while (n > 0) {
        int last = n % 10;
        reverse = reverse * 10 + last;
        n = n / 10;
    }
    int sqare = reverse * reverse;
    return sqare;
}

public static void main(String[] args) {
    int n = 12;
            // System.out.println(reverseOfNumber(12));
            // System.out.println(squareOfReverseNumber(12));
            if (squareOfReverseNumber(n) == reverseOfNumber(n)) {
                System.out.println("this is Adam Number");
            } else {
                System.out.println("this is not adam number");
            }
        }
}
