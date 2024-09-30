
import java.util.Stack;

class BalancedParentheses {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            System.out.println("Iteration :" + i);
            char currentChar = expression.charAt(i);

            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {

                if (stack.isEmpty() || !isMatchingPair(stack.pop(), currentChar)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')')
                || (opening == '{' && closing == '}')
                || (opening == '[' && closing == ']');
    }

    public static void main(String[] args) {
        String expression = "{([])}{}";  // You can change the input here for testing
        if (isBalanced(expression)) {
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
        }
    }
}
