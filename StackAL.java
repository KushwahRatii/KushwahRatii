import java.util.ArrayList;
public class StackAL {
    static class Stack{
        ArrayList<Integer> list=new ArrayList<>();

         //        push
        public void push(int data)
        {
            list.add(data);
        }
       //       isEmpty
        public boolean isEmpty()
        {
            return  (list.size()==0);
        }
        //pop
        public int pop(){
            if (isEmpty()){
                return -1;
            }
            int top=list.remove(list.size()-1);
            return top;
        }
        //peek
        public int peek(){
            if (isEmpty()){
                return -1;
            }
            return  list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack list=new Stack();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        while (!list.isEmpty()){
            System.out.println(list.peek());
            list.pop();
        }

    }

}
