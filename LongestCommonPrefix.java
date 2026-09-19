class LongestCommonPrefix {
    public String longestCommonPrefix(String arr[]) {
        if (arr == null || arr.length == 0) {
            return "";
        }
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix obj = new LongestCommonPrefix();
        String[] arr1 = {"geeksforgeeks", "geeks", "geek", "gee"};
        System.out.println("Output: " + obj.longestCommonPrefix(arr1)); 
        String[] arr2 = {"hello", "world"};
        System.out.println("Output: " + obj.longestCommonPrefix(arr2)); 
    }
}
