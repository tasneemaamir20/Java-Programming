class NumberProgramDay1 {
    // ! Q1. WRITE A JAVA PROGRAM TO CHECK WHETHER A NUMBER IS A TECH NUMBER OR NOT.
    // ? IF A NUMBER IS DIVIDED INTO TO PARTS AND SUM OF SQUARE OF THE TWO PARTS IS
    // ? EQUAL TO NUMBER ITSELF IS KNOWN AS TECH NUMBER WORKS ONLY FOR 4 DIGIT
    // NUMBER;
    /*
     * public static int countNumber(int n) {
     * int count = 0;
     * while (n > 0) {
     * count++;
     * n = n / 10;
     * }
     * return count;
     * }
     * 
     * public static boolean isTech(int n) {
     * int temp = n;
     * if (countNumber(n) % 2 == 0) {
     * int secondhalf = n % 100; // (10 * countNumber(n) / 2);
     * int firstHalf = n / 100; // (10 * countNumber(n) / 2);
     * if ((firstHalf + secondhalf) * (firstHalf + secondhalf) == temp) {
     * return true;
     * } else {
     * return false;
     * }
     * }
     * return true;
     * }
     * 
     * public static void main(String[] args) {
     * int n = 2025;
     * // int n = 1312;
     * System.out.println(isTech(n));
     * 
     * }
     * 
     */

    // ! Q 2. WRITE A JAVA PROGRAM TO FIND WHETHER THE NUMBER IS SMITH NUMBER OR
    // ! NOT.
    // ? THE SUM OF DIGITS OF THE NUMBER IS EQUAL TO SUM OF THE DIGITS OF PRIME
    // ? FACTORS OF THE NUMBER.
    // public static int sumOfDigits(int n) {
    // int sum = 0;
    // while (n > 0) {
    // sum += n % 10;
    // n = n / 10;
    // }
    // return sum;
    // }

    // public static int primeNumber(int n) {
    // for (int i = 2; i < n; i++) {
    // while (n % i == 0) {
    // n /= i;
    // return i;
    // }
    // }
    // if (n > 2) {
    // return n;
    // }
    // return -1;
    // }

    // public static boolean isSmithNumber(int n) {
    // int numerSum=sumOfDigits(n);
    // int sum = 0;
    // for (int i = 2; i < n; i++) {
    // while (n % i == 0) {
    // while (i > 0) {
    // sum += i % 10;
    // i = i / 10;
    // }
    // }
    // }
    // if (numerSum == sum) {
    // return true;
    // }
    // return false;
    // }

    // public static void main(String[] args) {
    // int n = 85;
    // System.out.println(isSmithNumber(n));
    // // System.out.println(primeNumber(n));
    // }

    // ! Q 3. Q3. WRITE A JAVA PROGRAM TO FIND WHETHER THE NUMBER IS BUZZ OR FIZZ OR
    // ! BOTH.
    // ? IF THE NOUMBER IS DIVISIBLE BY 7 IT IS KNOWN AS BUZZ IF THE NUMBER ENDS
    // ? WITH 7 IT IS FIZZ IF BOTH BUZZ-FIZZ ELSE NITHER OF THE ABOVE.

    // ! Q 4. WRITE A JAVA PROGRAM TO FIND ALL THE PRIME NUMBERS FROM 1 TO 100.
    // public static void main(String[] args) {

    // for (int i = 1; i <= 100; i++) {
    // int count = 0;
    // for (int num = i; num >= 1; num--) {
    // if (i % num == 0) {
    // count++;
    // }
    // }
    // if (count == 2) {
    // System.out.println(i + "it is prime number");
    // } else {
    // // System.out.println(i + " not prime number");
    // }

    // }
    // }

    // ! Q 5. WRITE A JAVA PROGRAM TO FIND FIRST 10 PRIME NUMBERS.
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count++;
                }
            }
            int output = 0;
            if (output < 11) {

                if (count == 2) {
                    System.out.println(i + "it is prime number");
                } else {
                    // System.out.println(i + " not prime number");
                }
                output++;
            } else {
                
            }
        }

    }

}