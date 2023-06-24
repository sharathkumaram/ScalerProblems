import java.util.ArrayList;

public class TransposeMatrix {

    public static ArrayList<ArrayList<Integer>> MatrixTranspose(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        int rsize = A.size();
        int csize = A.get(0).size();
        // Inserting some junk value. This is req to get the index and set the value
        for (int i = 0; i < csize; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < rsize; j++) {
                row.add(0);
            }
            B.add(row);
        }
        // Transpose logic
        for (int i = 0; i < rsize; i++) {
            for (int j = 0; j < csize; j++) {
                B.get(j).set(i, A.get(i).get(j));
            }
        }
        return B;
    }
}
