package NeetCode.Stack;

import java.util.Stack;

public class ReversePolish {
    public static void main(String[] args) {
        String [] tokens = {"2","1","+","3","*"};
    }
    public static int evalRPN(String[] tokens) {
        Stack<String> tk = new Stack<>();
        for(int i =tokens.length-1;i>0;i--){
                tk.push(tokens[i]);
        }
        int val =0;
        while (!tk.isEmpty()) {
            int num1=Integer.parseInt(tk.pop());
            int num2=Integer.parseInt(tk.pop());
            String op = tk.pop();
            if(op == "+"){
                val = num1+num2;
            } 
            else if (op == "-") {
                val = num1-num2;
            }
            else if (op == "*") {
                val = num1*num2;
            } 
            else if (op == "/") {
                val = num1/num2;
            }         
        }
        return 0;
    }
}
