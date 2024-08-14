class NumberProgramDay2 {

    // ! check the number it is xylem or phloem
    // public static int firLastSum(int n) {
    // int sum1 = 0;
    // int l = n % 10;
    // while (n >= 10) {
    // n = n / 10;

    // }
    // sum1 = l + n;

    // return sum1;
    // }

    // public static int inBetweenSum(int n) {
    // n = n / 10;
    // int innerSum = 0;
    // while (n >= 10) {
    // int innerDigit = n % 10;
    // innerSum += innerDigit;
    // n = n / 10;
    // }
    // return innerSum;
    // }

    // public static void main(String[] args) {
    // if (inBetweenSum(24125) == firLastSum(24125)) {
    // System.out.println("this is xylem ");
    // } else {
    // System.out.println("this is floem");
    // }
    // }

    // ! wajp to find whether the number is a spy number or not.if some of digit of
    // number and product of digit of number is same then its knows as spy number
    // !tc 123===>1+2+3=6||1*2*3=6 tc 451===>4+5+1=10||4*5*1=20 not a spy number

    // public static int sumOfDigit(int n) {
    // int sum = 0;
    // while (n > 0) {
    // int l = n % 10;
    // sum += l;
    // n = n / 10;
    // }
    // return sum;
    // }

    // public static int proOfDigit(int n) {
    // int product = 1;
    // while (n > 0) {
    // int l = n % 10;
    // product *= l;
    // n = n / 10;
    // }
    // return product;
    // }
    // public static void main(String[] args) {
    // int n = 123;
    // if (sumOfDigit(n) == proOfDigit(n)) {
    // System.out.println("this is spy number");
    // } else {
    // System.out.println("this is not spy number");
    // }
    // }

    // !o find whether the number ios neon number is not if a number by suaring its
    // number the sum of digit of number is equal to the number
    // itself.tc=9===>9*9=81||8+1=9 is an neon number
    // public static int squareOfDigit(int n) {
    // int square = n * n;
    // return square;
    // }
    // public static int sumOfSquareDigit(int n) {
    // int sum = 0;
    // int squareDigit = squareOfDigit(n);
    // while (squareDigit > 0) {
    // int l = squareDigit % 10;
    // sum += l;
    // squareDigit = squareDigit / 10;
    // }
    // return sum;
    // }
    // public static void main(String[] args) {
    // int n = 9;
    // if (n == sumOfSquareDigit(n)) {
    // System.out.println("this is Neon number");
    // } else {
    // System.out.println("this is not neon number");
    // }
    // }

    // ! check the number is peterson number or not
    // ? 145 = 5!+4!+1! =145 =yes this is peterson
    // public static int petersonNumber(int n) {
    // int sum = 0;
    // while (n > 0) {
    // int fact = 1;
    // int l = n % 10;
    // for (int i = 1; i <= l; i++) {
    // fact = fact * i;
    // }
    // sum += fact;
    // n = n / 10;
    // }
    // return sum;
    // }
    // public static void main(String[] args) {
    // int n = 145;
    // if (n == petersonNumber(n)) {
    // System.out.println("this is peterson number");
    // } else {
    // System.out.println("this is not pterson number");
    // }
    // }

    // !check the number is sunny number or not 
    // ? 80 =yes
    // public static boolean sunnyNumber(int n) {
    //     for (int i = 1; i < n; i++) {
    //         if (i * i == n + 1) {
    //             return true;
    //         } 
    //     }
    //     return false;
    // }
    // public static void main(String[] args) {
    //     if (sunnyNumber(80)) {
    //         System.out.println("this is sunny number");
    //     } else {
    //         System.out.println("this is not sunny number");
    //     }
    // }

    // ! 
}