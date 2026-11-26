import java.util.ArrayList;
import java.util.Collections;

class MajorityElementMoreThanNByThree {
    public static ArrayList<Integer> findMajority(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            return result;
        }

        int n = arr.length;
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;

        for (int num : arr) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : arr) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        int threshold = n / 3;
        if (count1 > threshold) {
            result.add(candidate1);
        }
        if (count2 > threshold) {
            result.add(candidate2);
        }

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 3, 1, 3, 2, 1, 1};
        System.out.println(findMajority(arr1)); 

        int[] arr2 = {-5, 3, -5};
        System.out.println(findMajority(arr2)); 

        int[] arr3 = {3, 2, 2, 4, 1, 4};
        System.out.println(findMajority(arr3)); 
    }
}
