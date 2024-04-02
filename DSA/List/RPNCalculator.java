package DSA.List;

public class RPNCalculator {
    LinkedListStack<Integer> numstk;
    public RPNCalculator(){
        numstk = new LinkedListStack<Integer>();
    };
    public int calculate(String str){
        //String[] arr = str.split(" ");
        if(str.isEmpty()) throw new RuntimeException("empty expression");
        int idx = 0;
        String tmp = "";
        int res = 0;
        while(idx <= str.length()){
            char cur = str.charAt(idx);
            if(cur != ' ' && cur < '0' || cur > '9') {
                int b = numstk.pop();
                int a = numstk.pop();
                char c = cur;
                numstk.push(operate(a, b, c));
                idx++;
            } else if(cur == ' ') continue;
              else {
                int end = idx + 1;
                while('0' <= str.charAt(end) && str.charAt(end) <= '9'){
                    end++;
                }
                int now = Integer.parseInt(str.substring(idx, end));
                numstk.push(now);
                idx = end;
            }
            idx++;
        }
        return numstk.pop();
    }
    private boolean isOpert(char item){
        if(item == '+' || item == '-' || item == '*' || item == '/') return true;
        return false;
    }
    private int operate(int a, int b, char op){
        switch(op){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                throw new RuntimeException("invalid operator");
        }
    }
}
