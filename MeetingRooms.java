import java.util.Arrays;

class MeetingRooms {
    
    public static boolean canAttend(int[][] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] < arr[i - 1][1]) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 4}, {10, 15}, {7, 10}};
        System.out.println(canAttend(arr)); 
    }
}
