class LargestFromDigits {
    
    public static String maxNumber(int[] arr) {
        int[] count = new int[10];
        for (int num : arr) {
            count[num]++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int digit = 9; digit >= 0; digit--) {
            while (count[digit] > 0) {
                sb.append(digit);
                count[digit]--;
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] arr = {9, 0, 1, 3, 0};
        System.out.println(maxNumber(arr)); 
    }
}
