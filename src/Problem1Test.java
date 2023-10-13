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
    }
    @Test public void test2(){
        int[] example = {25, 89, 78, 12};
        double expected = 51;
        double result = Problem1.problem2(example);
        assertEquals(expected,result);
    }

    @Test
    public void test3() {
        int[] grades = {25, 89, 78, 12};
        int[] expected = {25, 90, 80, 12};
        ArrayList<Integer> result = Problem1.problem3(grades);
        int[] results = new int[result.size()];
        for (int i = 0; i < result.size(); i++){
            results[i] = result.get(i);
        }
        assertArrayEquals(expected, results);
    }

    @Test
    public void test4() {
        int[] grades = {25, 89, 78, 12};
        int result = Problem1.problem4(grades);
        assertEquals(result,90);
    }

    @Test
    void testAll() {
        test1();
        test2();
        test3();
        test4();
    }
}
