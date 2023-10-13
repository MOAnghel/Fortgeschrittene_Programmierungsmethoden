public class Problem2Test {
    public void test1(){
        int[] notes = {4, 8, 3, 10, 17};
        int result = Problem2.problem1(notes);
        assert (result == 17);
        System.out.println("Test 1 done...");
    }

    public void test2(){
        int[] notes = {4, 8, 3, 10, 17};
        int result = Problem2.problem2(notes);
        assert (result == 3);
        System.out.println("Test 2 done...");
    }

    public void test3(){
        int[] notes = {4, 8, 3, 10, 17};
        int result = Problem2.problem3(notes);
        assert (result == 39);
        System.out.println("Test 3 done...");
    }

    public void test4(){
        int[] notes = {4, 8, 3, 10, 17};
        int result = Problem2.problem4(notes);
        assert (result == 25);
        System.out.println("Test 4 done...");
    }
    public void testAll(){
        System.out.println("Testing problem 2...");
        test1();
        test2();
        test3();
        test4();
    }
}
