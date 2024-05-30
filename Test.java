
class Test {
	// Q6.
	/*
	 * 
	 * int n=5;
	 * int star = n;
	 * int space = 0;
	 * 
	 * for(int i=0; i<=2*n; i++){
	 * if(i!=n){
	 * // spaces
	 * for(int j=0; j<space; j++){
	 * System.out.print(" ");
	 * }
	 * }
	 * 
	 * // star
	 * for(int j=0; j<star; j++){
	 * System.out.print("*" + " ");
	 * }
	 * 
	 * 
	 * if(i<n){
	 * star--;
	 * space++;
	 * }else{
	 * star++;
	 * space--;
	 * }
	 * if(i!=n){
	 * 
	 * System.out.println();
	 * }
	 * }
	 */

	/*
	 * 
	 * public static int countDigits(int n){
	 * int count = 0;
	 * while(n>0){
	 * count++;
	 * n = n/10;
	 * }
	 * return count;
	 * }
	 * 
	 * public static boolean isTech(int n){
	 * boolean isit = false;
	 * if(countDigits(n)!=4){
	 * System.out.println("Number is not of 4 digits.");
	 * return isit;
	 * }else{
	 * int temp = n;
	 * 
	 * int a = n%100;
	 * // first two digits.
	 * int b = n/100;
	 * if((a+b)*(a+b)==temp){
	 * isit = true;
	 * }
	 * return isit;
	 * }
	 * }
	 * 
	 * public static void main(String[] args) {
	 * int n = 2025;
	 * boolean answer = isTech(n);
	 * System.out.println(answer);
	 *      }
	 * 
	 * 
	 * 
	 * 
	 */

	/*
	 * 
	 * 
	 * // Q3. given n*n mtrix you have to print the element of a matrix in a snake
	 * pattern
	 * 
	 * 
	 * 
	 * 
	 * public static void main(String[]args)
	 * {
	 * int Arr[][]={{1,2,3},{4,5,6},{7,8,9}};
	 * 
	 * 
	 * for(int i=0;i<Arr.length;i++)
	 * {
	 * int display;
	 * for(int j=0;j<Arr.length;j++)
	 * {
	 * display=Arr[i][j];
	 * System.out.print(display);
	 * }
	 * 
	 * 
	 * }
	 * }
	 * 
	 * 
	 * 
	 */

	/*
	 * 
	 * 
	 * public static void main(String[] args){
	 * int [] arr= {5,32,1,7,10,50,19,21,2};
	 * 
	 * for(int i=0; i<arr.length; i++){
	 * for(int j=0; j<arr.length; j++){
	 * for(int k=0; k<arr.length; k++){
	 * if(arr[i] == arr[j] + arr[k]){
	 * System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
	 * }
	 * }
	 * }
	 * }
	 * }
	 * 
	 * 
	 * 
	 */

	/*
	 * 
	 * // Q1. you are given a string little consisting of one or more words
	 * seperated by a single space , where
	 * // each word consist of english letter capitalize the String by changing the
	 * capitalization of each word such that
	 * 
	 * // if length of the word is 1 or 2 letters change all letters to lowercase
	 * // otherwise , change the first letter to uppercase and remaining ltter to
	 * lower case
	 * 
	 * // title: "capitalize  tHe title"
	 * // output:"Capitalize The Title"
	 * 
	 * 
	 * 
	 * String s1="capitalize the title";
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * char c[]=new char[s1.length()];
	 * 
	 * for(int i=0;i<s1.length();i++)
	 * {
	 * c[i]=s1.charAt(i);
	 * 
	 * if(c[i]>='A'&&c[i]<='Z')
	 * 
	 * {
	 * 
	 * if(c[i]>='a' && c[i]<='z' && c[i]==' ')
	 * {
	 * c[i]=c[i+1];
	 * }
	 * }
	 * 
	 * else
	 * {
	 * 
	 * c[i]=(char)(c[i]-32);
	 * }
	 * c[i]=c[i+1];
	 * System.out.print(c[i]);
	 * 
	 * }
	 * 
	 * 
	 * 
	 */

}