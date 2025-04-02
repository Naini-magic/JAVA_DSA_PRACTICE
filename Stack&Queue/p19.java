import java.util.LinkedList;
import java.util.Queue;



// implement stack by the help to two queue 
public class p19 {
    
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here
	    if(q1.isEmpty()){
	        q1.add(a);
	    }else{
	        q2.add(a);
	        while(!q1.isEmpty()){
	           q2.add(q1.remove());
	        }
	        while(!q2.isEmpty()){
	           q1.add(q2.remove());
	        }
	    }
    }

    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
        if(q1.isEmpty()){
            return -1;
        }else{
           return q1.remove();
        }
    }

    void print(){
        System.out.println(q1);
     }
     
    
	

public static void main(String[] args) {
    p19 stack1 = new p19();
   stack1.push(10);
   stack1.push(20);
   stack1.push(30);
   stack1.push(40);

   stack1.print();

   System.out.println(stack1.pop());

   stack1.print();

}
}


