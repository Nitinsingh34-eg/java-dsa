 import java.util.*;   
 public class reversestack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack <Integer> st = new Stack<>();

        int n = sc.nextInt();
        for(int i=0;i<n; i++){
            st.push(sc.nextInt());

        }
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }

    }
    
}
