public class ls23_inversionCount{
    public static void main(String [] args){

        int arr[] = {2, 4, 1, 3, 5};
        System.out.println(divide(arr , 0 , arr.length - 1));
        // System.out.println(conquer(arr , 0 , arr.length));
        
    }

    
    public static int divide(int arr[], int start, int end) {
        int count = 0;
        if(start  < end){
        int mid = start + (end - start) / 2;

        count += divide(arr, start, mid);
        count += divide(arr, mid + 1, end);
        count += conquer(arr, start, mid, end);
        return count  ;
    }

    return 0;
}

    public static int conquer(int[] arr, int s, int m, int e ) {
        int merge[] = new int[e - s + 1];

        int id1 = s;  // 1st array ko track kr rha h
  
        int id2 = m + 1; // 2nd array ko track kr rha h
  
        int k = 0;
        int count = 0;
        while (id1 <= m && id2 <= e) {
            if (arr[id1] <= arr[id2]) {
                merge[k++] = arr[id1++];
            } else {
                merge[k++] = arr[id2++];
                count += ( m - id1 + 1);
            }
        }

        while (id1 <= m) {
            merge[k++] = arr[id1++];
        }

        while (id2 <= e) {
            merge[k++] = arr[id2++];
        }

        for (int i = 0, j = s; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }

        return count;
    }
}