// Given an integer N , write program to count number of digits in N.
public class countdigits {

    /*
     * //division by 10 method
     * 
     * //TC : O(N) sc: o(1)
     * public static int count_digits(int n) {
     * int x = n;
     * int count = 0;
     * while (x != 0) {
     * x = x / 10;
     * count++;
     * }
     * return count;
     * }
     */

    /*
     * // string to integer conversion
     * 
     * public static int count_digits(int n) {
     * String n1 = Integer.toString(n);
     * return n1.length();
     * }
     */

    // Use logarithm base 10 to count the number of digits. As
    // The number of digits in an integer = the upper bound of log10(n)
    public static int count_digits(int n) {

        int digits = (int) Math.floor(Math.log10(n) + 1);
        return digits;
    }

    public static void main(String[] args) {
        int n = 13455555;
        System.out.println("Number of digits in " + n + " is " + count_digits(n));
    }
}
