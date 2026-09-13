public class ArrayOperations {
    public int arrayOperations(int[] arr) {
        boolean hasZero = false;
        int count = 0;
        boolean inNonZeroBlock = false;

        for (int x : arr) {
            if (x == 0) {
                hasZero = true;
                inNonZeroBlock = false;
            } else {
                if (!inNonZeroBlock) {
                    count++;
                    inNonZeroBlock = true;
                }
            }
        }

        if (!hasZero) {
            return -1;
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayOperations obj = new ArrayOperations();

        int[] arr1 = {3, 0, 4, 5};
        System.out.println("Output: " + obj.arrayOperations(arr1)); 
        int[] arr2 = {10, 4, 9, 6, 10, 10, 4, 4};
        System.out.println("Output: " + obj.arrayOperations(arr2)); 
    }
}
