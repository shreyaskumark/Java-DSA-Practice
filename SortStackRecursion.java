import java.util.Stack;

public class SortStackRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(4);
        stack.push(6);
        stack.push(1);
        stack.push(8);

        System.out.println("Before Sorting : "+stack);
        Sort(stack);
        System.out.println("After Sorting : "+stack);
    }

    public static void Sort(Stack<Integer> stack){
        if(stack.size() == 1)
            return;

        int value = stack.peek();
        stack.pop();
        Sort(stack);
        Insert(stack,value);

    }

    public static void Insert(Stack<Integer> stack, int value){
        if(stack.size() == 0 || stack.peek() <= value)
            {
                stack.push(value);
                return;
            }

        int temp = stack.peek();
        stack.pop();
        Insert(stack, value);
        stack.push(temp);

    }
}
