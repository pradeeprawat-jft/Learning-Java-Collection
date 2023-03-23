import java.util.Stack;
public class StackCollection {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("Pradeep");
        s.push("jon");
        s.push("mukesh");
        s.push("Aarav");

        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.search("Pradeep"));
        System.out.println(s.isEmpty());
        System.out.println(s.capacity());
        System.out.println(s);

    }
}
