class CheckIdenticalArrays {
    
    public static boolean checkidentical(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {4, 3, 2, 1};
        System.out.println(checkidentical(a, b)); 
    }
}
