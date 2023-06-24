public class Main {

  public static void main(String[] args) {
    int A = 45;
    int B = 21;
    int C = 67;

    int minimumNumber = solve(A, B, C);
    System.out.println(
      "Minimum number obtained by concatenating " +
      A +
      ", " +
      B +
      ", and " +
      C +
      " is: " +
      minimumNumber
    );
  }

  private static int solve(int A, int B, int C) {
    int min = A < B ? (A < C ? A : C) : B < C ? B : C;
    int max = A > B ? (A > C ? A : C) : B > C ? B : C;
    int mid = A + B + C - (min + max);
    String s = Integer.toString(min) + Integer.toString(mid) + Integer.toString(max);
    return Integer.parseInt(s);
  }
}
