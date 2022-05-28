import java.util.Arrays;

public class Q15 {
    public static void main(String[] args) {
        Integer[] arr = { 5, 4, 6, 2, 1, 3, 8, 9, 7 };
        SortedArray(arr);
        System.out.printf("Sorted array : %s", Arrays.toString(arr));
    }
    static void SortedArray(Integer[] arr)
    {
        int n = arr.length;
        Arrays.sort(arr, 0, n/2);
        Arrays.sort(arr, n/2, n);
        int temp;

        int lower = n/2, high = n-1;
        while (lower < high)
        {
            temp = arr[lower];
            arr[lower] = arr[high];
            arr[high] = temp;
            lower++; high--;
        }
    }
}
