import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class Problem1Test {

    @Test
    public void test1() {
        int[] example = {25, 89, 78, 12};
        int[] expected = {25, 12};
        ArrayList<Integer> results;
        results = Problem1.problem1(example);
        int[] result = new int[results.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = results.get(i);
        }
        assertArrayEquals(expected, result);
        System.out.println("Test 1 done...");
    }
}
