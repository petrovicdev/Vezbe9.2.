import java.util.*;
public class JavaDeque {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> unique = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            unique.add(num);

            if(deque.size() > m){
                int removedNum = deque.removeFirst();
                if(!deque.contains(removedNum)){
                    unique.remove(removedNum);
                }
            }

            if(deque.size() == m){
                maxUnique = Math.max(maxUnique, unique.size());
            }
        }

        System.out.println(maxUnique);

        in.close();
    }
}



