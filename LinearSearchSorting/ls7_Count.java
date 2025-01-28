public class ls7_Count{
    public static void main(String [] args){
        int arr[] ={3, 1, 3, 3, 2};
        // System.out.println(majority_Element(arr));
        System.out.println(Majority(arr));
        int arr2[] = {1,2,3,2,2};
        System.out.println(Majority(arr2));

            }

       public static int Majority(int arr[]){
        int candidate = -1;
        int count = 0;
        for(int num : arr){
            if(count == 0){
                candidate = num;
            }

            if(num == candidate){
                count += 1;
            }else{
                count -= 1;
            }
        }


        count = 0;
        for(int num : arr){
            if(num == candidate) {
                count++;
            }
        }

        if(count > arr.length / 2){
            return candidate;
        }

        return -1;
       }ls





    // solution tc - O(n) sc - O(n) becauce hashmap
    public static int majority_Element(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }

        for(int num : map.keySet()){  
            if(map.get(num) > arr.length/2){
                return num;
            }
        }
        return -1;
    }

  
}