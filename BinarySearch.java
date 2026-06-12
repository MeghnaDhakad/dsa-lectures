import java.util.Arrays;

public class BinarySearch {

    // User-defined Binary Search
    public static int binarySearch(int arr[], int key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            else if (key > arr[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int key = 40;

        //normal binary search
        int result = binarySearch(arr, key);

        if(result != -1)
            System.out.println("Found at index: " + result);
        else
            System.out.println("Not Found");

        // built-in binary search 
        int index = Arrays.binarySearch(arr, key);

        System.out.println("Using Arrays.binarySearch(): " + index);
    }
}