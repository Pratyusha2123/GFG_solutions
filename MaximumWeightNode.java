class MaximumWeightNode {
    
    public static int maxWeightNode(int[] exits) {
        int n = exits.length;
        long[] weights = new long[n];
        for (int i = 0; i < n; i++) {
            if (exits[i] != -1) {
                weights[exits[i]] += i;
            }
        }

        long maxWeight = -1;
        int maxNode = 0;
        for (int i = 0; i < n; i++) {
            if (weights[i] >= maxWeight) {
                maxWeight = weights[i];
                maxNode = i;
            }
        }

        return maxNode;
    }
    public static void main(String[] args) {
        int[] exits1 = {2, 0, -1, 2};
        System.out.println("Test 1 Output: " + maxWeightNode(exits1)); 
        int[] exits2 = {-1};
        System.out.println("Test 2 Output: " + maxWeightNode(exits2)); 
    }
}
