class CelebrityProblem {
    
    public static int celebrity(int[][] mat) {
        int n = mat.length;
        int top = 0;
        int down = n - 1;
        while (top < down) {
            if (mat[top][down] == 1) {
                top++;
            } else {
                down--;
            }
        }
        
        int candidate = top;
        for (int i = 0; i < n; i++) {
            if (i == candidate) continue;
            if (mat[candidate][i] == 1 || mat[i][candidate] == 0) {
                return -1;
            }
        }
        
        return candidate;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {0, 1, 0},
            {0, 0, 0},
            {0, 1, 0}
        };
        System.out.println(celebrity(mat)); 
    }
}
