import java.util.HashMap;
import java.util.HashSet;

public class s31Computer {
    public static void main(String[] args) {
        String s = "GACCBDDBAGEE";
        int n = 3;
        System.out.println(UnoccupiedComputer(n, s));
        s = "ABCBAC";
        n = 1;
        System.out.println(UnoccupiedComputer(n, s));
    }
    public static int UnoccupiedComputer(int n , String s){
        int walkaway = 0;
        int occ = 0;
        HashSet<Character> c = new HashSet<>();
        HashSet<Character> walkedAway = new HashSet<>();
        for(char customer : s.toCharArray() ){
         if(c.contains(customer)){
            c.remove(customer);
            occ--;
         }else if (!walkedAway.contains(customer)){
            if(occ < n){
                c.add(customer);
                occ++;
            }else{
                walkaway++;
                walkedAway.add(customer);
            }
         }
        }
        return walkaway;
    }
    }

