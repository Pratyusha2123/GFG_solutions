class NthGeekyNumber {
    
    public static long solve(int N, int K, long[] geekNum) {
        if (N <= K) {
            return geekNum[N - 1];
        }
        
        long[] terms = new long[N];
        long currentSum = 0;
        for (int i = 0; i < K; i++) {
            terms[i] = geekNum[i];
            currentSum += geekNum[i];
        }
        for (int i = K; i < N; i++) {
            terms[i] = currentSum;
            currentSum = currentSum + terms[i] - terms[i - K];
        }
        
        return terms[N - 1];
    }

    public static void main(String[] args) {
        int N = 5, K = 3;
        long[] geekNum = {0, 1, 2};
        System.out.println(solve(N, K, geekNum)); 
    }
}
