public class MatrixInterchange {
    public static void interchange(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        
        for (int i = 0; i < rows; i++) {
            int temp = mat[i][0];
            mat[i][0] = mat[i][cols - 1];
            mat[i][cols - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {4, 3, 2, 1},
            {6, 7, 8, 9}
        };
        
        interchange(mat);
        
        System.out.println("Output matrix:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
