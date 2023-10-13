import java.util.ArrayList;

public class Problem3 {
    public static ArrayList<Integer> problem1(int[] number1, int[] number2) {
        int carry_flag = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = number1.length - 1; i > 0; i--) {
            if (number1[i] + number2[i] + carry_flag >= 10) {
                if(carry_flag == 0){
                    carry_flag = (number1[i] + number2[i]) / 10;
                    result.add((number1[i] + number2[i]) % 10);
                } else {
                    carry_flag = (number1[i] + number2[i] + carry_flag) / 10;
                    result.add((number1[i] + number2[i] + carry_flag) % 10);
                }
            }
        }
        return result;
    }
}
