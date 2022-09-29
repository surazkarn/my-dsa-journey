//Given a number check if it is a palindrome.
//An integer is considered a palindrome when it reads the same backward as forward.

//O(logN)

public class palindrome {

    public static int pald(int n) {

        int temp = 0;
        while (n != 0) {
            int rem = n % 10; // 134/10 then rem -> 4

            temp = temp * 10 + rem; // 0*10+4
            n = n / 10; // 134/10 = 13

        }

        return temp;

    }

    public static void main(String[] args) {
        int n = 35;
        int dummy = n;
        int y = pald(n);

        if (dummy == y) {
            System.out.println("palindrome");
        } else {
            System.out.println("NOT palindrome");
        }

    }

}
