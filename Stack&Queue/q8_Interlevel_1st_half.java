import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class q8_Interlevel_1st_half {
    public static Queue<Integer> Interlevel(Queue<Integer> q) {
        int size = q.size();
        int n = size/2;
        Queue<Integer> q2 = new LinkedList<>();

        for(int i = 0 ; i < n ; i++){
           q2.add(q.poll());
        }
        
    
        while(!q2.isEmpty()){
            q.add(q2.poll());
            q.add(q.poll());
        }


        if(size % 2 != 0){
            q.remove();
        }
        
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        q.add(17);
        q.add(18);
        q.add(19);
        q.add(20);

        System.out.println(q);
        System.out.println(Interlevel(q));
    }
}
