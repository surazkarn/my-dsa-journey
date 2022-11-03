//Functional Recursion

public class Functional {
    public static void main(String[] args) {

        f(3);
    }

    public static int f(int n) {

        if (n == 0)
            return 0;

        return n + 3;

    }
}

// sum of first n numbers
public class Parameter {
    public static void main(String[] args) {
        System.out.println(para(3));
    }

    public static int para(int n) {
        if (n == 0) {
            return 0;
        }
        return n + para(n - 1);

    }
}
