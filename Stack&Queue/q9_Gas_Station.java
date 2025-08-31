public class q9_Gas_Station {
    public static int Gas_Station(int gas[] , int cost[]){
        int totalGas = 0 , totalCost = 0;
        for(int i = 0 ; i < gas.length ; i++){
         totalGas += gas[i];
        }
 
        for(int i = 0 ; i < cost.length ; i++){
         totalCost += cost[i];
        }
 
        if(totalGas < totalCost) {
         return -1;
        }
 
        int start = 0 , currGas = 0;
 
        for(int i = 0 ; i < gas.length ; i++ ){
         currGas += (gas[i] - cost[i]);
         if ( currGas < 0 ){
             start = i + 1;
             currGas = 0;
         }
        }
 
        return start;
    }
    
    public static void main(String[] args) {
        int gas[] = {4 , 5 , 7 , 4};
        int cost[] = {6 , 6 , 3 ,5};

    System.out.println(Gas_Station(gas, cost));;
    }
}
