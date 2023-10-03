import java.util.*;
class BalanceParanthesis {
    public static void main(String[] args) {
        String str = "(())[]";
        System.out.print(check(str));
    }
    public static boolean check(String str){
        Stack stack = new Stack();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='(' || c == '[' || c=='{'){
                stack.push(c);
                continue;
            }
            if(stack.isEmpty()) return false;
            char top;
            switch(c){
                case ')':
                    top = (char)stack.pop();
                    if(top == '{' || top == '[') return false;
                    break;
                case '}':
                    top = (char)stack.pop();
                    if(top == '[' || top == '(') return false;
                    break;
                case ']':
                    top = (char)stack.pop();
                    if(top == '{' || top == '(') return false;
                    break;
            }
            
        }
        return (stack.isEmpty());
    }
}
