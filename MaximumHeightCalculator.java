import java.util.ArrayList;

class Height {
    int feet;
    int inches;

    Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }
}

public class MaximumHeightCalculator {
    public static int findMax(ArrayList<Height> arr) {
        int maxInches = 0;
        for (Height h : arr) {
            int currentInches = (h.feet * 12) + h.inches;
            if (currentInches > maxInches) {
                maxInches = currentInches;
            }
        }
        return maxInches;
    }

    public static void main(String[] args) {
        ArrayList<Height> arr = new ArrayList<>();
        arr.add(new Height(1, 2));
        arr.add(new Height(2, 1));

        int result = findMax(arr);
        System.out.println("Maximum height in inches: " + result);
    }
}
