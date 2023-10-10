import java.util.ArrayList;

public class Problem1 {
    public static ArrayList<Integer> problem1(int[] grades){
        ArrayList<Integer> notSufficient = new ArrayList<>();
        for (int i = 0; i < grades.length; i++){
            if (grades[i] < 40){
                notSufficient.add(grades[i]);
            }
        }
        return notSufficient;
    }

    public static double problem2(int[] grades){
        double sum = 0;
        for (int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        return sum / grades.length;
    }
}
