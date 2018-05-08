import java.util.Stack;

/**
 * Created by Eliza Liu on 2018/5/7
 */
public class P20ValidParentheses {

    public static void main(String[] args){

    }
    public boolean isValid(String s) {
        if(s==null)
            return true;
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c == '{' || c== '[' || c== '('){
                stack.push(c);
            }else{
                if(stack.empty())
                    return false;
                char p = stack.pop();
                if(c == ')'){
                    if(p != '(')
                        return false;
                }
                if(c == ']'){
                    if(p != '[')
                        return false;
                }
                if(c == '}'){
                    if(p != '{')
                        return false;
                }
            }
        }
    if(stack.isEmpty())
        return  true;
    else
        return false;
    }
}
