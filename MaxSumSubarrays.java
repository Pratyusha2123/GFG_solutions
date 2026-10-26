public class MaxSumSubarrays {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 1}; 
        
        int maxAdjacentSum = Integer.MIN_VALUE; 
        for (int i = 0; i < arr.length - 1; i++) { 
            int currentSum = arr[i] + arr[i + 1]; 
            if (currentSum > maxAdjacentSum) { 
                maxAdjacentSum = currentSum; 
            }
        }
        System.out.println(maxAdjacentSum);
    }
}
