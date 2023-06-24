package leetcode;

public class mergeTwoString {

  public static void main(String[] args) {
    String s1 = "Sharath";
    String s2 = "S";
    System.out.println(mergeAlternatively(s1,s2));
  }

  public static String mergeAlternatively(String word1, String word2) {
    int i = 0;
    int j = 0;
    String ans = "";
    int n = word1.length();
    int m = word2.length();

    while (i < n || j < m) {
      if (i == n) {
        ans += word2.charAt(j);
        j++;
      }
      else if (j == m) {
        ans += word1.charAt(i);
        i++;
      }
      else {
        ans += word1.charAt(i);
        ans += word2.charAt(j);
        i++;
        j++;
      }
    }
    return ans;
  }
}
