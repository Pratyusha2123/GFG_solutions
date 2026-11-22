import java.util.Arrays;

class AssignCookies {

    public static int maxChildren(int[] greed, int[] cookie) {
        Arrays.sort(greed);
        Arrays.sort(cookie);

        int i = 0; 
        int j = 0; 

        while (i < greed.length && j < cookie.length) {
            if (cookie[j] >= greed[i]) {
                i++;
            }
            j++; 
        }

        return i;
    }

    public static void main(String[] args) {
        int[] greed1 = {1, 10, 3};
        int[] cookie1 = {1, 2, 3};
        System.out.println(maxChildren(greed1, cookie1)); // Output: 2

        int[] greed2 = {10, 100};
        int[] cookie2 = {1, 2};
        System.out.println(maxChildren(greed2, cookie2)); // Output: 0
    }
}
