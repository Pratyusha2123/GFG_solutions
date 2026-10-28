import java.util.ArrayList;
public class MatrixSpiralTraversal {
    public static ArrayList<Integer> spirallyTraverse(int[][] mat) {
        ArrayList<Integer> result = new ArrayList<>();
        if (mat == null || mat.length == 0) {
            return result;
        }
        
        int n = mat.length;
        int m = mat[0].length;
        
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;
        
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                result.add(mat[top][j]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.add(mat[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(mat[bottom][j]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(mat[i][left]);
                }
                left++;
            }
        }
        return result;
    }
        public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        ArrayList<Integer> spiralOrder = spirallyTraverse(mat);
        System.out.println("Output: " + spiralOrder);
    }
}

