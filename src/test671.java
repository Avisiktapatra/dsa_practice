import java.util.Stack;

public class test671 {
    int n;
    int[] inc;
    Stack<Integer> stack;
    public test671(int maxSize) {
        n = maxSize;
        inc = new int[n];
        stack = new Stack<>();
    }

    public void push(int x) {
        if (stack.size() < n)
            stack.push(x);
    }

    public int pop() {
        int i = stack.size() - 1;
        if (i < 0)
            return -1;
        if (i > 0)
            inc[i - 1] += inc[i];
        int res = stack.pop() + inc[i];
        inc[i] = 0;
        return res;
    }

    public void increment(int k, int val) {
        int i = Math.min(k, stack.size()) - 1;
        if (i >= 0)
            inc[i] += val;
    }

    public static void main(String[] args) {
        test671 t = new test671(3);
        t.push(1); t.push(2); t.push(3); t.increment(5,100);
    }
}
