
public class BackTrackOnetoN {
    public static void main(String[] args) {
        name(5, 5);
    }

    private static void name(int i, int n) {
        if (i < 1)
            return;
        name(i - 1, n);
        System.out.println(i);
    }
}
