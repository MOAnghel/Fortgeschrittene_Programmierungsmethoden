import org.junit.jupiter.api.Test;

public class Problem2Test {
    @Test public void test1(){
        int[] notes = {4, 8, 3, 10, 17};
        int result = Problem2.problem1(notes);
        assert (result == 17);
    }

    @Test public void test2(){
        int[] notes = {4, 8, 3, 10, 17};
        int result = Problem2.problem2(notes);
        assert (result == 3);
    }

    @Test public void test3(){
        int[] notes = {4, 8, 3, 10, 17};
        int result = Problem2.problem3(notes);
        assert (result == 39);
    }

    @Test public void test4(){
        int[] notes = {4, 8, 3, 10, 17};
        int result = Problem2.problem4(notes);
        assert (result == 25);
    }
    @Test public void testAll(){
        test1();
        test2();
        test3();
        test4();
    }
}
