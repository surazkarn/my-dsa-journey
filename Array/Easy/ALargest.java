//https://docs.google.com/document/d/1FYXE8UOJKVoVI5dIMg-q1nbuD5JtGkkEt94B2h76o_c/edit#heading=h.mkd9mhobla3j

import java.util.Arrays;

public class ALargest {
    public static void main(String[] args) {
        int arr1[] = { 8, 5, 1, 3, 0 };
        System.out.println("Largest Element in the array: " + findLargest(arr1));
    }

    // public static int findLargest(int arr[]) {

    // Arrays.sort(arr);
    // return arr[arr.length - 1];
    // }

    // Using a max variable
    public static int findLargest(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        return max;

    }

}
