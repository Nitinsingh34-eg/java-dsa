import java.util.*;

public class  BaseballGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            String op = sc.next();

            if(op.equals("+")) {
                int a = st.pop();
                int b = st.peek();
                int sum = a + b;
                st.push(a);
                st.push(sum);
            }
            else if(op.equals("D")) {
                st.push(2 * st.peek());
            }
            else if(op.equals("C")) {
                st.pop();
            }
            else {
                st.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for(int x : st) sum += x;

        System.out.println(sum);
    }
}