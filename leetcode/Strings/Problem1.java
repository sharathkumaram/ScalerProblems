//vowels and consonants

public class Problem1 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();

    for (int i = 0; i < t; i++) {
      String str = scn.next();

      int n = str.length();
      int vowels = 0;
      int consonants = 0;
      for (int j = 0; j < n; j++) {
        char ch = str.charAt(j);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
          vowels++;
        } else {
          consonants++;
        }
      }

      System.out.println(vowels + " " + consonants);
    }
  }
}
