package recursion;

import java.util.Arrays;

public class SumOfDigit {
    public static void main(String[] args) {

        System.out.println("Sum of digid  :  " + sumOfDigit(123456));
        int arr[] = {1, 3, 5, 7, 4, 22, 33, 5, 77, 23};
        mergeSort(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }

    static int sumOfDigit(int num) {
        if (num < 10) {
            return num;
        }
        return num % 10 + sumOfDigit(num / 10);
    }


    static void mergeSort(int arr[]) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int mid = 0 + arr.length / 2;
        int leftarr[] = new int[mid];
        int rightarr[] = new int[arr.length - (mid)];
        System.arraycopy(arr, 0, leftarr, 0, mid);
        if (arr.length - mid >= 0)

            System.arraycopy(arr, mid, rightarr, 0, arr.length -mid);

        mergeSort(leftarr);
        mergeSort(rightarr);
        merge(leftarr, rightarr, arr);
    }

    private static void merge(int[] leftarr, int[] rightarr, int sortedArray[]) {
        int i = 0, j = 0,k=0;
        while (i < leftarr.length && j < rightarr.length) {
            if (leftarr[i] <= rightarr[j]) {
                sortedArray[k] = leftarr[i];
                i++;
                k++;
            }
          else{
                sortedArray[k] = rightarr[j];
                j++;
                k++;
            }
        }

        while (i < leftarr.length) {
            sortedArray[k++] = leftarr[i];
            i++;
        }
        while (j < rightarr.length) {
            sortedArray[k++] = rightarr[j];
            j++;
        }

    }
}
