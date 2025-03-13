import java.util.ArrayList;

public class p2_implementation2 {
    static class Stack{
        ArrayList<Integer> al = new ArrayList<>();
        public void push(int data){
            al.add(data);
        }
        public boolean isEmpty(){
            return al.size() == 0;
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = al.remove(al.size() - 1);
            return top;
        }
        public int peek() {
            if(isEmpty()){
                return -1;
            }
            return al.get(al.size()-1);
        }
    }
    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
