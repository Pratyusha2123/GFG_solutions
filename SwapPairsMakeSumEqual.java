import java.util.HashSet;

class SwapPairsMakeSumEqual {
    public static boolean findSwapValues(int[] a, int[] b) {
        long sumA = 0;
        long sumB = 0;
        
        for (int val : a) {
            sumA += val;
        }
        HashSet<Integer> setB = new HashSet<>();
        for (int val : b) {
            sumB += val;
            setB.add(val);
        }
        long diff = sumA - sumB;
        if (diff % 2 != 0) {
            return false;
        } 
        long target = diff / 2;
        for (int valA : a) {
            long valB = valA - target;
            if (valB >= Integer.MIN_VALUE && valB <= Integer.MAX_VALUE) {
                if (setB.contains((int) valB)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        int[] a1 = {4, 1, 2, 1, 1, 2};
        int[] b1 = {3, 6, 3, 3};
        System.out.println("Test 1 Output: " + findSwapValues(a1, b1)); 
        int[] a2 = {5, 7, 4, 6};
        int[] b2 = {1, 2, 3, 8};
        System.out.println("Test 2 Output: " + findSwapValues(a2, b2)); 
        int[] a3 = {3, 3};
        int[] b3 = {6, 5, 6, 6};
        System.out.println("Test 3 Output: " + findSwapValues(a3, b3)); 
    }
}