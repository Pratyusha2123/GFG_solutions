public class ColumnWithMaxZeros {
    public static int maxZeros(int[][] arr) {
        int n = arr.length;
        int maxZerosCount = 0;
        int maxColIndex = -1;
        
        for (int j = 0; j < n; j++) {
            int currentZeros = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i][j] == 0) {
                    currentZeros++;
                }
            }
            if (currentZeros > maxZerosCount) {
                maxZerosCount = currentZeros;
                maxColIndex = j;
            }
        }
        return maxColIndex;
    }

    public static void main(String[] args) {
        int[][] mat1 = {
            {0, 0, 0},
            {1, 0, 1},
            {0, 1, 1}
        };
        System.out.println("Output 1: " + maxZeros(mat1));
        int[][] mat2 = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };
        System.out.println("Output 2: " + maxZeros(mat2));
    }
}
