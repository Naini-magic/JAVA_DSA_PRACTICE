public class p10_duplicateNO {
    public static void main(String[] args) {
        
    }
 
    public static int DuplicateNo(int []arr){
        int i = 0;
        int t = arr[i];            
        int step = (arr.length-1)-i;
        while (i < arr.length) {
            

        if(t == arr[i] ){
            return arr[i];
        }
        else{
            i++;
            step--;
        }
        if(step==0 && arr[i] != t){
            t = arr[]
        }
        }
    
    
    }
}
