package leetcode.Strings;

public class reverseWorDByWord {

  public static String reverseWords(String A) {
    StringBuilder sb = new StringBuilder();
    int i = A.length() - 1;
    while (i >= 0 && A.charAt(i) == ' ') i--;
    while (i >= 0) {
      int j = i;
      while (i >= 0 && A.charAt(i) != ' ') i--;
      sb.append(A.substring(i + 1, j + 1));
      //System.out.println(A.substring(i+1,j+1));
      while (i >= 0 && A.charAt(i) == ' ') i--;
      if (i >= 0) sb.append(' ');
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    String input = "  Hello   World  ";
    String reversedString = reverseWords(input);
    System.out.println(reversedString); // Output: "World Hello"
  }
}
