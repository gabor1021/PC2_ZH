import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MatrixTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MATRIX_LENGTH = 5;

    // TODO: Uncomment testcase to test sumOfNumbersDivisibleByFive method.

   /* @Test
    public void testSumOfNumbersDivisibleByFive() {
        int[][] matrix = {
                { 84,  67,  22, -72,  95},
                { 72, -70,   2, -88,  30},
                { 95, -79, -87, -27, -97},
                {-52, -64, -13, -19, -27},
                { 79,  89,  95, -84, -53}
        };

        assertEquals(245, Matrix.sumOfNumbersDivisibleByFive(matrix));
    }


    // TODO: Uncomment testcase to test indexOfRowsWithZeros method.

    /*@Test
    public void testIndexOfRowsWithZeros() {
        int[][] matrix = {
                { 84,  67,  22, -72,  95},
                { 72, -70,   2, -88,  30},
                { 95, -79, -87, -27, -97},
                {-52, -64, -13, -19, -27},
                {  0,   0,   0,   0,   0}
        };

        ArrayList<Integer> actual = Matrix.indexOfRowsWithZeros(matrix);

        assertEquals(1, actual.size());
        assertTrue(actual.contains(4));
    }
*/
}
