import java.util.Stack;

public class ReverseStackRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Before Reversing : "+stack);
        reverseStack(stack);
        System.out.println("After Reversing : "+stack);
    }

    public static void reverseStack(Stack<Integer> stack){
        if(stack.size() == 1)
            return;
        
        int elem = stack.pop();
        reverseStack(stack);
        insert(stack,elem);
    }

    public static void insert(Stack<Integer> stack, int elem){
        if(stack.size() == 0)
        {
            stack.push(elem);
            return;
        }
        int temp = stack.pop();
        insert(stack,elem);
        stack.push(temp);
    }
}
