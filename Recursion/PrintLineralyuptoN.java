public class PrintLineralyuptoN {

    public static void main(String[] args) {
        linear(1, 5);
    }

    public static void linear(int i, int n) {

        if (i > n)
            return;
        System.out.println(i);
        linear(i + 1, n);
    }

}
