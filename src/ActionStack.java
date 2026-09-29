import java.util.Stack;

public class ActionStack {

    private Stack<String> stack = new Stack<>();

    public void push(String action) {
        stack.push(action);
    }

    public void display() {

        if (stack.isEmpty()) {
            System.out.println("No recent actions.");
            return;
        }

        System.out.println("\nRecent Actions:");

        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println("- " + stack.get(i));
        }
    }
}