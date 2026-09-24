public class MaxDistance {
    public int getCount(int[] arr, int x, int y) {
        if (x == y) {
            return -1;
        }

        int firstX = -1, lastX = -1;
        int firstY = -1, lastY = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                if (firstX == -1) {
                    firstX = i;
                }
                lastX = i;
            }
            
            if (arr[i] == y) {
                if (firstY == -1) {
                    firstY = i;
                }
                lastY = i;
            }
        }

        if (firstX == -1 || firstY == -1) {
            return -1;
        }

        int option1 = Math.abs(lastY - firstX) - 1;
        int option2 = Math.abs(lastX - firstY) - 1;

        return Math.max(option1, option2);
    }

    public static void main(String[] args) {
        MaxDistance sol = new MaxDistance();
        int[] arr = {3, 5, 4, 2, 6, 3, 0, 5, 4, 8, 3};
        int x = 3;
        int y = 5;
        
        int result = sol.getCount(arr, x, y);
        System.out.println("Maximum Distance: " + result);
    }
}