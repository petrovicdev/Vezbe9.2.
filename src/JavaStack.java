import java.util.Scanner;
import java.util.Stack;
public class JavaStack {

    private static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '[') stack.push(ch);
            else if (stack.empty()) return false;
            else{
                char last = stack.pop();
                if((ch == ')' && last != '(') || (ch == ']' && last != '[') || (ch == '}' && last != '{')) return false;
            }

        }

        return stack.isEmpty();
    }

    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String input = sc.next();
            System.out.println(isBalanced(input));
        }

        sc.close();
    }
}
