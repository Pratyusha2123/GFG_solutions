class MinimumSwapsToGroupElements {
    
    public static int minSwap(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                count++;
            }
        }
        
        if (count <= 1) return 0;
        int bad = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] > k) {
                bad++;
            }
        }
        
        int minBad = bad;
        for (int i = 0, j = count; j < n; i++, j++) {
            if (arr[i] > k) {
                bad--;
            }
            if (arr[j] > k) {
                bad++;
            }
            
            minBad = Math.min(minBad, bad);
        }
        
        return minBad;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 3};
        int k = 3;
        System.out.println(minSwap(arr, k)); 
    }
}
