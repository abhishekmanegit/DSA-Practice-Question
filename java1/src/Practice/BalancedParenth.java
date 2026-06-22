package Practice;

import java.util.Stack;

public class BalancedParenth {
    static boolean isBalanced(String exp){

        Stack<Character> stack = new Stack<>();

        for(char ch : exp.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;

                char open = stack.pop();

                if(ch == ')' && open !=  '(')
                if(ch == '}' && open != '{')
                    if(ch == ']' && open != '[')
                        return false;
            }
        }

        return stack.isEmpty();


    }
    public static void main(String [] args){
        System.out.println(isBalanced("{[()]}"));
    }
        }