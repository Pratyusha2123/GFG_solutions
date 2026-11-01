class MostFrequentInLimitedRange {
    
    public static int maxRepeating(int k, int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[arr[i] % k] += k;
        }
        
        int maxFreq = arr[0] / k;
        int result = 0;
        for (int i = 1; i < k; i++) {
            int freq = arr[i] / k;
            if (freq > maxFreq) {
                maxFreq = freq;
                result = i;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] arr = {2, 2, 1, 2};
        System.out.println(maxRepeating(k, arr)); 
    }
}
