public class BuildingsWithSunlight {
    public static int visibleBuildings(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int count = 0;
        int maxHeight = 0;

        for (int height : arr) {
            if (height >= maxHeight) {
                count++;
                maxHeight = height;
            }
        }

        return count;
    }
    public static void main(String[] args) {

        int[] arr1 = {6, 2, 8, 4, 11, 13};
        System.out.println("Output 1: " + visibleBuildings(arr1)); 

        int[] arr2 = {2, 5, 1, 8, 3};
        System.out.println("Output 2: " + visibleBuildings(arr2)); 
    }
}
