import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> row = new ArrayList<>(); // create 2D list
        // [[list of numbers in row], [list of numbers in row]] -> list of lists
        for (int i = 0; i < numRows; i++) {
            List<Integer> newRow = new ArrayList<>();
            for (int j = 0; j <= i ; j++) {
                if (j == 0 || j == i) {
                    newRow.add(1);
                } else {
                    int valueLeft = row.get(i-1).get(j-1);
                    int valueRight = row.get(i-1).get(j);
                    newRow.add(valueLeft + valueRight);
                }
            }
            row.add(newRow);
        }
        return row;
    }
}
