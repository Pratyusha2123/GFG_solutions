class TwoStacks {
    int[] arr;
    int size;
    int top1, top2;
    TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }
    void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        }
    }
    void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        }
    }
    int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        }
        return -1;
    }
    int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        }
        return -1;
    }
}

public class TwoStacksInArray {
    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(100);
        
        ts.push1(2);
        ts.push1(3);
        ts.push2(4);
        
        System.out.println("pop1() Output: " + ts.pop1()); 
        System.out.println("pop2() Output: " + ts.pop2()); 
        System.out.println("pop2() Output: " + ts.pop2()); 
    }
}


