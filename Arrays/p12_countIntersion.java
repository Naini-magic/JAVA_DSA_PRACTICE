public class p12_countIntersion {
    public static void main(String[] args) {
    int arr[] = {2, 4, 1, 3, 5};
    int arr2[] = {2, 3, 4, 5, 6};
    int arr3[] = {10, 10, 10};

System.out.println(count(arr));
System.out.println(count(arr2));
System.out.println(count(arr3));


    int n = arr.length;
        divide(arr3, 0, n - 1);
      System.out.println(inversionCount);
    }
// not correct

    static int inversionCount = 0;
    public static void divide(int arr[] , int start , int end){
        if(start >= end){
            return;
        }
    
        int mid = start + (end - start)/2;
        divide(arr, start , mid);
        divide(arr, mid+1 , end);
        conquer(arr , start , mid , end);
    }
    public static void conquer(int[] arr , int s , int m , int e){
        int merge[] = new int[e - s + 1];
           
        int id1 = s;
        int id2 = m + 1;
        int k = 0;
        while (id1 <= m && id2 <= e) {
            if(arr[id1] <= arr[id2]){
                merge[k++] = arr[id1++];
            }else{
                merge[k++] = arr[id2++];
                //   // If arr[id1] > arr[id2], then all elements from arr[id1] to arr[m] will form an inversion
                inversionCount += (m - id1 + 1);
            }
        }
    
        while(id1 <= m){
            merge[k++] = arr[id1++];
        }
    
        while (id2 <= e) {
            merge[k++] = arr[id2++];
        }
    
        for(int i=0 , j=s ; i<merge.length ; i++ , j++){
         arr[j] = merge[i];
        }
    }

    public static int count ( int []arr){
        int i = 0;
        int j = arr.length -1;
        int count = 0;
        while (i < arr.length) {
            if(arr[i] > arr[j]){
                count++;
                j++;
            }else{
                j++;
            }
            if(j == i+1){
                i++;
            }
        }
     return count;
    }
}


