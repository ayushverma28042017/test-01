package recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.printf("Eleemnt eisist at index : " + b_search(arr, 0, arr.length - 1, 88));
    }


    static int b_search(int[] arr, int start, int end, int key) {
        int mid = -1;
        if (start <= end) {
            mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            }
            if (key < arr[mid]) {

                return b_search(arr, start, mid - 1, key);
            }
            if (key > arr[mid]) {
                return b_search(arr, mid + 1, end, key);
            }
        }
        return -1;

    }
}
