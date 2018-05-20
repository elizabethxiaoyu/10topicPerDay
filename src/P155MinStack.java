import java.util.Stack;

/**
 * Created by Eliza Liu on 2018/5/19
 */


class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minNumStack;
    /** initialize your data structure here. */
    public MinStack() {
        this.stack = new Stack<Integer>();
        this.minNumStack = new Stack<>();
    }

    public void push(int x) {
        this.stack.push(x);

        if(minNumStack.isEmpty() || minNumStack.peek() >= x)
            this.minNumStack.push(x);

    }

    public void pop() {
        //这个是错误的
//        if(stack.peek() == minNumStack.peek())
//            minNumStack.pop();
//        this.stack.pop();

        int x = this.stack.pop();
        if(x == this.minNumStack.peek())
            this.minNumStack.pop();

    }

    public int top() {
        return this.stack.peek();

    }

    public int getMin() {
        return minNumStack.peek();
    }
}

public class P155MinStack {


}
