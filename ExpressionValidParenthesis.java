import java.util.Stack;

public class ExpressionValidParenthesis {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        // Sample Expression -- [[{}]()]

        String exp = "[[{}]{}()]";

        for (int i = 0; i < exp.length(); i++) {
            if (stack.empty())
            {
                stack.push(exp.charAt(i));
                continue;
            }
            char rev = getReverseOf(exp.charAt(i));

            if(rev == stack.peek()){
                stack.pop();
                continue;
            }
            else{
                stack.push(exp.charAt(i));
                continue;
            }
        }
        if(stack.isEmpty()){
            System.out.println("Valid Parenthesis");
        }
        else{
            System.out.println("Invalid Parenthesis");
        }

    }

    public static char getReverseOf(char atIndexI){
        char reverseChar = ' ';

        switch(atIndexI){
            case ']' : reverseChar = '[';
            break;
            case '}' : reverseChar = '{';
            break;
            case ')' : reverseChar = '(';
            break;
            default : reverseChar = '!';
            break;
        }

        return reverseChar;
    }

}