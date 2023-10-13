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
    @Test public void test2(){
        int[] example = {25, 89, 78, 12};
        double expected = 51;
        double result = Problem1.problem2(example);
        assertEquals(expected,result);
        System.out.println("Test 2 done...");
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
        System.out.println("Test 3 done...");
    }

    @Test
    public void test4() {
        int[] grades = {25, 89, 78, 12};
        int result = Problem1.problem4(grades);
        assertEquals(result,90);
        System.out.println("Test 4 done...");
    }

    @Test
    void testAll() {
        System.out.println("Testing problem1...");
        test1();
        test2();
        test3();
        test4();
    }
}
