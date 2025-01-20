public class p19MaxProduct {
    public static void main(String[] args) {
        int arr[] = {6 , -3, -10, 0, 2};
        System.out.println(max(arr));

        int []arr2 = {2, 3, 4, 5, -1, 0};
        System.out.println(max(arr2));

        int []arr3 = {2, 3, 4};
        System.out.println(max(arr3));
    }

  

 public static  long max(int[] arr) {
        // Initialize the maximum product, minimum product, and result
        long maxProduct = arr[0];
        long minProduct = arr[0];
        long result = arr[0];

        // Traverse the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is negative, swap maxProduct and minProduct
            if (arr[i] < 0) {
                long temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update maxProduct and minProduct for the current element
            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);

            // Update the result with the current maximum product
            result = Math.max(result, maxProduct);
        }

        return result;
    }
   }

