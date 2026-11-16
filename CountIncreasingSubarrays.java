class CountIncreasingSubarrays {
    
    public static long countIncreasing(int[] arr) {
        long count = 0;
        long len = 1; 
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                len++;
                count += (len - 1); 
            } else {
                len = 1; 
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 7, 9};
        System.out.println(countIncreasing(arr)); 
    }
}
