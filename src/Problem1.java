import java.util.ArrayList;

public class Problem1 {
    /**
     * Returns a list of not sufficient grades.
     * Not sufficient grades are grades smaller than 40.
     */
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

    public static ArrayList<Integer> problem3(int[] grades){
        ArrayList<Integer> rounded_grades = new ArrayList<>();
        for (int i = 0; i < grades.length; i++){
            if (grades[i] > 40 && grades[i] % 5 > 2 ){
                rounded_grades.add(grades[i] + (5 - grades[i] % 5));
            } else {
                rounded_grades.add(grades[i]);
            }
        }
        return rounded_grades;
    }

    public static int problem4(int[] grades){
        ArrayList<Integer> rounded_grades = problem3(grades);

        int max = 0;
        for (int i = 0; i < rounded_grades.size(); i++){
            if(rounded_grades.get(i) > max){
                max = rounded_grades.get(i);
            }
        }
        return max;
    }
}
