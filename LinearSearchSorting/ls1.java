
import java.util.ArrayList;

public class ls1 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int x = 5;
        System.out.println(duplicate(arr, x));
        int arr2[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 };
        x = 7;
        System.out.println(duplicate(arr2, x));
        int arr3[] = { 1, 2, 3 };
        x = 4;
        System.out.println(duplicate(arr3, x));
    }
 

    // this is in the binary search TC - O(log n)
    static ArrayList<Integer> duplicate(int[] arr, int target) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(search(arr , target , true));

        ar.add(search(arr, target, false));
 
        return ar;
    }

    static int search(int[] arr, int target , boolean findfirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length -1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(findfirst){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }



    //// this is linear search solution and TC - O(n)
    public static ArrayList<Integer> index(int[] arr, int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }

            if (i == arr.length - 1) {
                ans.add(first);
                ans.add(last);
            }

        }
        return ans;
    }

    // my solution

    public static ArrayList<Integer> index2(int[] arr, int x) {

        ArrayList<Integer> ans = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }

            if (i == arr.length - 1 && count == 0) {
                ans.add(-1);
                ans.add(-1);
                return ans;
            }
            if (arr[i] == x && arr[i + 1] != x) {
                ans.add(i - count + 1);
                ans.add(i);
                return ans;
            }
        }

        return ans;
    }
}
