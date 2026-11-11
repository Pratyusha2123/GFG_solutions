import java.util.Arrays;
class BusConductor {
    public static int findMoves(int[] chairs, int[] passengers) {
        Arrays.sort(chairs);
        Arrays.sort(passengers);
        
        int totalMoves = 0;
        for (int i = 0; i < chairs.length; i++) {
            totalMoves += Math.abs(chairs[i] - passengers[i]);
        }
        
        return totalMoves;
    }
    public static void main(String[] args) {
        int[] chairs = {3, 1, 5};
        int[] passengers = {2, 7, 4};
        System.out.println(findMoves(chairs, passengers)); 
    }
}