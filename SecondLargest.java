public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;
        
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }
        
        return secondLargest;
    }

    public static void main(String[] args) {
        SecondLargest solver = new SecondLargest();
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        System.out.println("Output: " + solver.getSecondLargest(arr1)); 
    }
}
