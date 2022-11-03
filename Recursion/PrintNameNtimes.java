import java.util.Scanner;

//print name N times using Recursion

public class PrintNameNtimes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f(1, n);
    }

    public static void f(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Suraj");
        f(i + 1, n);

    }

}
