import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] example = {25, 89, 78, 12};
        ArrayList<Integer> results = new ArrayList<>();
        results = Problem1.problem1(example);
        for (int i = 0; i < results.size(); i++){
            System.out.println(results.get(i));
        }

        System.out.println(Problem1.problem2(example));
    }
}