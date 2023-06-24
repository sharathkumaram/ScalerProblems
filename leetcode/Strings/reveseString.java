package leetcode.Strings;

public class reveseString {
    public static String reverseString(String A) {
        char[] arr = A.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversed = reverseString(str);
        System.out.println("Reversed String: " + reversed);
    }
}