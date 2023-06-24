package leetcode.solve1;

public class pattern {
  public ArrayList<ArrayList<Integer>> solve(int A) {
    ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();

    for (int i = 1; i <= A; i++) {
      ArrayList<Integer> arr = new ArrayList<Integer>();
      for (int j = 1; j <= i; j++) {
        arr.add(j);
      }
      mat.add(arr);
    }
    return mat;
  }
}
