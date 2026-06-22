package Practice;

import java.util.Stack;

public class ReverseStr {

    public static void main(String[] args){

        String str = "Abhi";
        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            stack.push(ch);
        }

        String reversed = "";
        while(stack.isEmpty()){
            reversed += stack.pop();

            System.out.println(reversed);

        }

    }
}
