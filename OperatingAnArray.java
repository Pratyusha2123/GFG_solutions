import java.util.ArrayList;
import java.util.List;

public class OperatingAnArray {
    public static boolean searchEle(List<Integer> arr, int x) {
        return arr.contains(x);
    }
    public static boolean insertEle(List<Integer> arr, int y, int yi) {
        if (yi >= 0 && yi <= arr.size()) {
            arr.add(yi, y);
            return true;
        }
        return false;
    }
    public static boolean deleteEle(List<Integer> arr, int z) {
        int index = arr.indexOf(z);
        if (index != -1) {
            arr.remove(index);
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>(List.of(2, 4, 1, 0, 2));
        int x1 = 1, y1 = 2, yi1 = 2, z1 = 0;
        
        System.out.println("Search " + x1 + ": " + searchEle(arr1, x1));
        System.out.println("Insert " + y1 + " at index " + yi1 + ": " + insertEle(arr1, y1, yi1) + ", Array: " + arr1);
        System.out.println("Delete " + z1 + ": " + deleteEle(arr1, z1) + ", Array: " + arr1);
        List<Integer> arr2 = new ArrayList<>(List.of(17, 15, 8, 9, 12));
        int x2 = 10, y2 = 6, yi2 = 2, z2 = 5;
        
        System.out.println("\nSearch " + x2 + ": " + searchEle(arr2, x2));
        System.out.println("Insert " + y2 + " at index " + yi2 + ": " + insertEle(arr2, y2, yi2) + ", Array: " + arr2);
        System.out.println("Delete " + z2 + ": " + deleteEle(arr2, z2) + ", Array: " + arr2);
    }
}
