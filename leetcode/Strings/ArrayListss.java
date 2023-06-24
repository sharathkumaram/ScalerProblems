import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListss {

  public static ArrayList<Integer> solve(ArrayList<Integer> A) {
    int array_length = A.size();
    ArrayList<Integer> new_arl = new ArrayList<>();
    int val = 0;
    for (int j = 0; j < array_length; j++) {
      int count = 0;
      int checker = A.get(j);
      for (int k = 0; k < array_length; k++) {
        if (checker == A.get(k)) {
          count++;
        }
      }
      new_arl.add(j, count);
    }
    return new_arl;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> al = new ArrayList<>();
    int size = sc.nextInt();
    for (int i = 0; i < size; i++) {
      int val = sc.nextInt();
      al.add(val);
    }
    ArrayList<Integer> new_al = new ArrayList<>();
    new_al = solve(al);
    System.out.println(new_al);
  }
}
