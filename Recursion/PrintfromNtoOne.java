
public class PrintfromNtoOne {
    public static void main(String[] args) {
        name(1, 5);
    }

    private static void name(int i, int n) {
        if (i > n)
            return;
        name(i + 1, n);
        System.out.println(i);

    }
}
