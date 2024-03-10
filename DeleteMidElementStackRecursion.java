import java.util.Stack;

public class DeleteMidElementStackRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        //stack.push(6);
        int size = (stack.size() + 1)/2;
        System.out.println("Before deleting : "+stack);
        delete(stack,size);
        System.out.println("After deleting : "+stack);
    }

    public static void delete(Stack<Integer> stack, int size){
        if(size == 1)
        {
            stack.pop();
            return;
        }

        int temp = stack.peek();
        stack.pop();
        delete(stack,size-1);
        stack.push(temp);
    }
}