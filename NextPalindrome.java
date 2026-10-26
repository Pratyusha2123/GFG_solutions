import java.util.ArrayList;

public class NextPalindrome {
    public static void main(String[] args) {
        int[] arr = {9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2}; 
        
        int n = arr.length;
        boolean allNines = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 9) {
                allNines = false;
                break;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        
        if (allNines) {
            result.add(1);
            for (int i = 0; i < n - 1; i++) {
                result.add(0);
            }
            result.add(1);
        } else {
            for (int i = 0; i < n; i++) {
                result.add(arr[i]);
            }
            
            int mid = n / 2;
            int i = mid - 1;
            int j = (n % 2 == 0) ? mid : mid + 1;
            
            boolean leftSmaller = false;
            
            while (i >= 0 && result.get(i).equals(result.get(j))) {
                i--;
                j++;
            }
            
            if (i < 0 || result.get(i) < result.get(j)) {
                leftSmaller = true;
            }
            
            i = mid - 1;
            j = (n % 2 == 0) ? mid : mid + 1;
            
            while (i >= 0) {
                result.set(j, result.get(i));
                i--;
                j++;
            }
            
            if (leftSmaller) {
                int carry = 1;
                i = mid - 1;
                
                if (n % 2 == 1) {
                    int sum = result.get(mid) + carry;
                    result.set(mid, sum % 10);
                    carry = sum / 10;
                    j = mid + 1;
                } else {
                    j = mid;
                }
                
                while (i >= 0) {
                    int sum = result.get(i) + carry;
                    result.set(i, sum % 10);
                    carry = sum / 10;
                    result.set(j, result.get(i));
                    i--;
                    j++;
                }
            }
        }
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
