//This only works when there are no duplicates

import java.util.*;

public class BSecondLargest {

    static private void getElements(int arr[], int n) {
        Arrays.sort(arr);
        int secSmall = arr[1];
        int secLarge = arr[n - 2];
        System.out.println("Second Smallest: " + secSmall);
        System.out.println("Second Large: " + secLarge);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 4, 8, 34, 18 };
        int n = arr.length;
        getElements(arr, n);
    }
}
