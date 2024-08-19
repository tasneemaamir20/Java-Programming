public class NumberProgramDay6 {
    // !WRITE A JAVA PROGRAM TO FIND WHETHER THE NUMBER IS AN EVIL NUMBER OR NOT.
    // EX: 11, 1212, 1213141 IF THE NUMBER OF 1's IN THE NUMBER IS EVEN THEN IT IS
    // KNOWN AS EVIL NUMBER.
    // public static int countDigit(int n) {
    // String str = Integer.toString(n);
    // int count = 0;
    // for (int i = 0; i < str.length() ; i++) {
    // if (str.charAt(i) == '1') {
    // count++;
    // }
    // }
    // return count;
    // }

    // public static void main(String[] args) {
    // int n = 1213141511;
    // System.out.println(countDigit(n));
    // if (countDigit(n) % 2 == 0) {
    // System.out.println("This is Evil Number");
    // } else {
    // System.out.println("This is Not Evil Number");
    // }
    // }
    // ! WRITE A JAVA PROGRAM TO FIND WHETHER THE NUMBER IS AN UNIQUE NUMBER OR
    // NOT.A NUMBER WITH NO REPEATED DIGITS IS CALLED AS UNIQUE
    // NUMBER.EX:1,12,123,1234
    public static boolean uniqueNumber(int n) {
        String str = Integer.toString(n);
        boolean flag = true;
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    flag = false;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(uniqueNumber(n));
        if (uniqueNumber(n)) {
            System.out.println("This is Unique Number");
        } else {
            System.out.println("This is Not Unique Number");
        }
    }
}
