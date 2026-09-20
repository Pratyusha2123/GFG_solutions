class OneOddOccuring {
    int getOddOccurrence(int[] arr) {
        int res = 0;
        for (int num : arr) {
            res ^= num;
        }
        return res;
    }

    public static void main(String[] args) {
        OneOddOccuring obj = new OneOddOccuring();
        int[] arr1 = {1, 2, 3, 2, 3, 1, 3};
        System.out.println("Output: " + obj.getOddOccurrence(arr1)); 
        int[] arr2 = {5, 7, 2, 7, 5, 2, 5};
        System.out.println("Output: " + obj.getOddOccurrence(arr2)); 
    }
}
