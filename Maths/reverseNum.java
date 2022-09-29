
//Given a number N reverse the number and print it.
public class reversenum {

    public static int rev(int n) {

        int temp = 0;
        while (n != 0) {
            int rem = n % 10; // 134/10 then rem -> 4

            temp = temp * 10 + rem; // 0*10+4
            n = n / 10; // 134/10 = 13

        }

        return temp;
    }

    public static void main(String[] args) {
        int n = 134;
        System.out.println(rev(n));

    }

}
