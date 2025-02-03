import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test_cases {
    @Test
    public void testPascalTriangle() {

        // test case 1: 3 rows
        PascalTriangle pt = new PascalTriangle();
        List<List<Integer>> actual1 = pt.generate(3);
        List<List<Integer>> expected1 = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1)
        );
        assertEquals(expected1, actual1);
    }

    @Test
    public void testPascalTriangle2() {
        // test case 2: 5 rows
        PascalTriangle pt = new PascalTriangle();
        List<List<Integer>> actual2 = pt.generate(5);
        List<List<Integer>> expected2 = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 3, 3, 1),
                Arrays.asList(1, 4, 6, 4, 1)
        );
        assertEquals(expected2, actual2);
    }

    @Test
    public void testSpiralMatrix() {

        int[][] testCase = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}};

        SpiralMatrix sm = new SpiralMatrix();
        List<Integer> actual1 = sm.spiralOrder(testCase);
        List<Integer> expected1 = new ArrayList<>(Arrays.asList(1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8));
        assertEquals(expected1, actual1);
    }

    @Test
    public void testSpiralMatrix2() {

        int[][] testCase = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        SpiralMatrix sm = new SpiralMatrix();
        List<Integer> actual2 = sm.spiralOrder(testCase);
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5));
        assertEquals(expected2, actual2);
    }
}