public class TwoRepeatedElements {
    public int[] twoRepeated(int[] arr, int n) {
        int[] result = new int[2];
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int val = Math.abs(arr[i]);
            if (arr[val] < 0) {
                result[idx++] = val;
            } else {
                arr[val] = -arr[val];
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        TwoRepeatedElements solver = new TwoRepeatedElements();
        int n1 = 4;
        int[] arr1 = {1, 2, 1, 3, 4, 3};
        int[] res1 = solver.twoRepeated(arr1, n1);
        System.out.println("Example 1 Output: [" + res1[0] + ", " + res1[1] + "]"); 
        int n2 = 2;
        int[] arr2 = {1, 2, 2, 1};
        int[] res2 = solver.twoRepeated(arr2, n2);
        System.out.println("Example 2 Output: [" + res2[0] + ", " + res2[1] + "]"); 
    }
}
