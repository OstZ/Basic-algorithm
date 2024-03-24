package DSA;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class Calculator {
    public List<String> getElem(String str){
        List<String> elements = new ArrayList<>();
        int idx = 0;
        while(idx < str.length()){
            char cur = str.charAt(idx);
            if(cur != ' ' && cur < '0' || cur > '9') {
                elements.add(String.valueOf(cur));
                idx++;
            } else if(cur == ' ') {
                idx++;
                continue;
            }
            else {
                int end = idx + 1;
                while('0' <= str.charAt(end) && str.charAt(end) <= '9'){
                    end++;
                }
                elements.add(str.substring(idx, end));
                idx = end;
            }
        }
        return elements;
    }
    //infix to postfix
    public List<String> inToPost(List<String> infix){
        Stack<String> operates = new Stack<>();
        List<String> res = new ArrayList<>();
        for(String str : infix){
            char tmp = str.charAt(0);
            if(tmp == '+' || tmp == '-'){
                while(!operates.isEmpty()){
                    if(operates.peek().equals("(")) break;
                    res.add(operates.pop());
                }
                operates.add(str);
            } else if(tmp == '*' || tmp == '/'){
                while(!operates.isEmpty() && ( operates.peek().equals("*") || operates.peek().equals("/"))){
                    res.add(operates.pop());
                }
                operates.add(str);
            } else if(tmp == '(') operates.add(str);
            else if(tmp == ')') {
                while(!operates.peek().equals("(")) res.add(operates.pop());
                operates.pop();
            } else {
                res.add(str);
            }
        }
        while(!operates.isEmpty()) res.add(operates.pop());
        return res;
    }
    public int RPN(List<String> rpn){
        int[] arr = new int[(rpn.size() + 1)];
        int top = -1;
        for(int i = 0; i < rpn.size(); ++i){
            String str = rpn.get(i);
            if(str.equals("+")) {
                int b = arr[top--];
                int a = arr[top--];
                arr[++top] = a + b;
            } else if(str.equals("-")){
                int b = arr[top--];
                int a = arr[top--];
                arr[++top] = a - b;
            } else if(str.equals("*")){
                int b = arr[top--];
                int a = arr[top--];
                arr[++top] = a * b;
            } else if(str.equals("/")){
                int b = arr[top--];
                int a = arr[top--];
                arr[++top] = a / b;
            } else {
                arr[++top] = Integer.parseInt(str);
            }
        }
        return arr[0];
    }
    public int compute(String str){
        return this.RPN(this.inToPost(this.getElem(str)));
    }
}
