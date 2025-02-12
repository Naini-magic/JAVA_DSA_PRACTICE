public class ls16_k_thElement{
    public static int merge(int ar1[] , int ar2[] , int v){
        int arr[] = new int[ar1.length + ar2.length];
 
        int i = 0 ; int j = 0;
        int k = 0;
        while(i < ar1.length && j < ar2.length){
           if(ar1[i] < ar2[j]){
            arr[k] = ar1[i];
            i++;
            k++;
           }else if(ar1[i] > ar2[j]){
             arr[k] = ar2[j];
             j++;
             k++;
           }else{
            arr[k] = ar1[i];
            k++;
            i++;
            arr[k] = ar2[j];
            k++;
            j++;
           }
        }

        while(i < ar1.length){
            arr[k] = ar1[i];
            k++;
            i++;
        }
        while(j < ar2.length){
            arr[k] = ar2[j];
            k++;
            j++;
        }

        return arr[v-1];
    }


    
    public static void main (String [] args){
        int ar1[] = {2, 3, 6, 7, 9};
        int ar2[] = {1, 4, 8, 10};
        int k = 5;
        System.out.println(merge(ar1 , ar2 , k));
    }
}