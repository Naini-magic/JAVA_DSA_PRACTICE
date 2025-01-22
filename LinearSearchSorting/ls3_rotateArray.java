public class ls3_rotateArray {
    public static int rotate(int arr[] , int target){
      int pivot = findPivot(arr);

      if(pivot == -1){
        return binarySerach(arr, target, 0 , arr.length-1);
      }
      if(arr[pivot] == target){
        return pivot;
      }

      if(target >= arr[0]){
        return binarySerach(arr, target, 0, pivot-1);
      }
      return binarySerach(arr, target, pivot+1, arr.length-1);

    }


    public static int binarySerach(int arr[] , int target , int start , int end){
        while(start <= end ){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }


    public static int findPivot(int arr[] ){
       int start = 0;
       int end = arr.length -1;
       while (start < end) {
        int mid = start + (end - start) / 2;
        if( mid < end && arr[mid] > arr[mid+1]){
           return arr[mid];
        }
        if(start < mid && arr[mid] < arr[mid-1]){
            return arr[mid - 1];
        }

        if(arr[start] >= arr[mid]){
            end = mid;
        }else{
            start = mid -1;
        }
       }
       return -1;
    }


    public static void main(String[] args){
        int arr[] = { 3 , 4 ,5 , 6 , 7 , 0 , 1 , 2};
int target = 6;
        System.out.println(rotate(arr, target));
        System.out.println(findPivot(arr));
    } 
}
