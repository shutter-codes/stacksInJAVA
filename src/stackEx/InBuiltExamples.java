import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(25);
        stack.push(30);
        stack.push(35);
        stack.push(40);
        stack.push(45);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
