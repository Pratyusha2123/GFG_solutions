class SeatingArrangement {
    
    public static boolean canSeatAllPeople(int k, int[] seats) {
        int n = seats.length;
        
        for (int i = 0; i < n - 1; i++) {
            if (seats[i] == 1 && seats[i + 1] == 1) {
                return false;
            }
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 0) {
                boolean prevEmpty = (i == 0) || (seats[i - 1] == 0);
                boolean nextEmpty = (i == n - 1) || (seats[i + 1] == 0);
                
                if (prevEmpty && nextEmpty) {
                    seats[i] = 1;
                    count++;
                }
            }
        }
        
        return count >= k;
    }

    public static void main(String[] args) {
        int k1 = 2;
        int[] seats1 = {0, 0, 1, 0, 0, 0, 1};
        System.out.println("Test 1 Output: " + canSeatAllPeople(k1, seats1)); 
        int k2 = 1;
        int[] seats2 = {0, 1, 0};
        System.out.println("Test 2 Output: " + canSeatAllPeople(k2, seats2)); 
        int k3 = 0;
        int[] seats3 = {0, 0, 0, 1, 1};
        System.out.println("Test 3 Output: " + canSeatAllPeople(k3, seats3)); 
    }
}