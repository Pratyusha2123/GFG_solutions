class RoofTop {
    
    public static int maxStep(int[] arr) {
        int maxSteps = 0;
        int currentSteps = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                currentSteps++;
                maxSteps = Math.max(maxSteps, currentSteps);
            } else {
                currentSteps = 0;
            }
        }
        
        return maxSteps;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2};
        System.out.println(maxStep(arr)); 
    }
}
