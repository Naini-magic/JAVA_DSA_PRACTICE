public class p5 {
    
}


import java.util.Arrays;

public class RotateArray {
    public static void rotateClockwiseByOne(int[] arr) {
        // Step 1: Store the last element
        int lastElement = arr[arr.length - 1];
        
        // Step 2: Shift all elements to the right by one position
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        
        // Step 3: Place the last element in the first position
        arr[0] = lastElement;
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 2, 3, 4, 5};
        rotateClockwiseByOne(arr1);
        System.out.println("Rotated array: " + Arrays.toString(arr1));

        // Example 2
        int[] arr2 = {9, 8, 7, 6, 4, 2, 1, 3};
        rotateClockwiseByOne(arr2);
        System.out.println("Rotated array: " + Arrays.toString(arr2));
    }
}
