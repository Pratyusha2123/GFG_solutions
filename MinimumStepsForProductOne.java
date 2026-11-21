import java.util.ArrayList;
import java.util.Arrays;

class MinimumStepsForProductOne {

    public static int makeProductOne(ArrayList<Integer> arr) {
        int steps = 0;
        int negCount = 0;
        int zeroCount = 0;

        for (int num : arr) {
            if (num > 0) {
                steps += (num - 1);
            } else if (num < 0) {
                steps += (-1 - num);
                negCount++;
            } else {
                steps += 1;
                zeroCount++;
            }
        }
        if (negCount % 2 != 0 && zeroCount == 0) {
            steps += 2;
        }

        return steps;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(-2, 4, 0));
        System.out.println(makeProductOne(list1)); 

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(-1, 1, -1));
        System.out.println(makeProductOne(list2)); 
    }
}
