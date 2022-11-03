
public class BackTrackNtoOne {
    public static void main(String[] args) {
        name(1, 5);
    }

    private static void name(int i, int n) {
        if (i > 5)
            return;
        name(i + 1, n);
        System.out.println(i);
    }
}
