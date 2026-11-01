class FindRepetitiveElement {
    
    public static int findDuplicate(int[] arr) {
        int n = arr.length;
        long actualSum = 0;
        
        for (int num : arr) {
            actualSum += num;
        }
        long expectedSum = (long)(n - 1) * n / 2;
        
        return (int)(actualSum - expectedSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4};
        System.out.println(findDuplicate(arr)); 
    }
}