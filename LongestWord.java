class LongestWord {
    public String longest(String[] arr) {
        String maxStr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > maxStr.length()) {
                maxStr = arr[i];
            }
        }
        return maxStr;
    }

    public static void main(String[] args) {
        LongestWord obj = new LongestWord();
        String[] arr1 = {"Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"};
        System.out.println("Output: " + obj.longest(arr1)); 
        String[] arr2 = {"Apple", "Mango", "Orange", "Banana"};
        System.out.println("Output: " + obj.longest(arr2)); // 
    }
}
