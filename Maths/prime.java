// Given a number, check whether it is prime or not. 
//A prime number is a natural number that is only divisible by 1 and by itself.

public class prime {
    public static void main(String[] args) {
        int n = 26;
        boolean flag = true;

        for (int i = 2; i <= n - 1; i++) {

            if (n % i == 0) {
                flag = false;
            }
        }

        if (n != 1 && flag == true) {
            System.out.println("prime");

        } else {
            System.out.println("not prime");

        }
    }
}
