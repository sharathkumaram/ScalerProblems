import java.util.ArrayList;

public class MultiplesOfEachElement {
    public static ArrayList<ArrayList<Integer>> findDivisibleValues(int[] A, int[] B) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < B.length; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < A.length; j++) {
                if (A[j] % B[i] == 0) {
                    row.add(A[j]);
                }
            }
            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {1, 2};

        ArrayList<ArrayList<Integer>> result = findDivisibleValues(A, B);

        // Printing the result
        for (ArrayList<Integer> row : result) {
            System.out.println(row);
        }
    }
}
