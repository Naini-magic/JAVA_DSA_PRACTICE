import java.util.Arrays;
import java.util.*;

public class ls26_Partition_sort{
    
    public static void threeWayPartition(int[] arr, int lowVal, int highVal) {
        int start = 0, end = arr.length - 1, i = 0;

        while (i <= end) {
            if (arr[i] < lowVal) {
                // Swap arr[i] with arr[start] and move start & i forward
                swap(arr, i, start);
                start++;
                i++;
            } else if (arr[i] > highVal) {
                // Swap arr[i] with arr[end] and move end backward
                swap(arr, i, end);
                end--;
            } else {
                // Move to the next element
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }





    public static int[] sortByFrequency(int[] arr) {
        // Step 1: Count the frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort using a custom comparator (higher frequency first, then by value)
        Arrays.sort(arr, (a, b) -> {
            int freqCompare = freqMap.get(b) - freqMap.get(a); // Descending frequency
            return (freqCompare != 0) ? freqCompare : Integer.compare(a, b); // If same freq, sort by value
        });

        return arr;
    }



    public static void countingSort(int[] arr, int maxValue) {
        int[] count = new int[maxValue + 1];

        // Count occurrences
        for (int num : arr) {
            count[num]++;
        }

        // Reconstruct the sorted array
        int index = 0;
        for (int i = 0; i <= maxValue; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 4, 3, 2, 1, 3, 4, 1};
        int low = 2, high = 3;

        System.out.println("Original Array: " + Arrays.toString(arr));
        threeWayPartition(arr, low, high);
        System.out.println("Partitioned Array: " + Arrays.toString(arr));
    }

}