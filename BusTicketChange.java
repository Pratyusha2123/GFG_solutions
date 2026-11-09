class BusTicketChange {
    
    public static boolean canServe(int[] arr) {
        int count5 = 0;
        int count10 = 0;
        
        for (int note : arr) {
            if (note == 5) {
                count5++;
            } else if (note == 10) {
                if (count5 > 0) {
                    count5--;
                    count10++;
                } else {
                    return false;
                }
            } else if (note == 20) {
                if (count10 > 0 && count5 > 0) {
                    count10--;
                    count5--;
                } else if (count5 >= 3) {
                    count5 -= 3;
                } else {
                    return false;
                }
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 10, 20};
        System.out.println(canServe(arr)); 
    }
}
