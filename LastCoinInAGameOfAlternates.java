class LastCoinInAGameOfAlternates {
    public int coin(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] >= arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        LastCoinInAGameOfAlternates obj = new LastCoinInAGameOfAlternates();
        int[] arr1 = {5, 3, 1, 6, 9};
        System.out.println("Output: " + obj.coin(arr1)); 
    }
}
