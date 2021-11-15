package Job_Assessment;

import java.util.Stack;

class Java {
    static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i < 11; i++) {
            stack.push(i);
        }
        for(int i = stack.size();i > 0; i--) {
            System.out.println(stack);
            stack.pop();
        }
    }
}

