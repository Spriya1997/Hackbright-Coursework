package DAA;

import java.util.Arrays;

public class Sorting {
    //insertion sort - O(n^2))
    private static int[] insertionSort(int[] arr){
        for(int i = 1; i < arr.length; ++i){
            int current = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > current){
                arr[prev + 1] = arr[prev];
                prev -=1;
            }
            arr[prev + 1] = current;
        }
        return arr;
    }
    //quick sort - O(n log n)
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        helper(arr, 0, arr.length - 1);
    }

    private static void helper(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            helper(arr, low, partitionIndex - 1);
            helper(arr, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        System.out.println("Insertion sort "+ Arrays.toString(insertionSort(arr)));
        quickSort(arr);
        System.out.print("Quick sort : ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        
    }

}
