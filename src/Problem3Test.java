import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class Problem3Test {

    @Test
    void test1() {
        int[] number1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] number2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] expected = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ArrayList<Integer> result = Problem3.problem1(number1,number2);
        assert (expected.length == result.size());
        for(int i = 0; i < expected.length; i++){
            assert (expected[i] == result.get(i));
        }
    }
    @Test
    void test2(){
        int[] number1 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] number2 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] expected = {2, 9, 0, 0, 0, 0, 0, 0, 0};
        ArrayList<Integer> result = Problem3.problem2(number1,number2);
        assert (expected.length == result.size());
        for(int i = 0; i < expected.length; i++){
            assert (expected[i] == result.get(i));
        }
    }
}