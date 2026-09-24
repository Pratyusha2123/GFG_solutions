import java.util.Arrays;

class CheckAP {
    public boolean checkIsAP(int[] arr) {
        int n = arr.length;
        if (n <= 2) {
            return true;
        }
        
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        
        for (int i = 2; i < n; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        CheckAP sol = new CheckAP();
        int[] arr = {0, 12, 4, 8};
        
        boolean result = sol.checkIsAP(arr);
        System.out.println("Is Arithmetic Progression: " + result); 
    }
}
