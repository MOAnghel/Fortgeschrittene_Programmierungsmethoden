import java.util.ArrayList;

public class Problem3 {
    public static ArrayList<Integer> problem1(int[] number1, int[] number2) {
        int overflow = 0;
        ArrayList<Integer> inverted_result = new ArrayList<>();
        for (int i = number1.length - 1; i >= 0; i--) {
            if (number1[i] + number2[i] + overflow >= 10) {
                if(overflow == 0){
                    overflow = (number1[i] + number2[i]) / 10;
                    inverted_result.add((number1[i] + number2[i]) % 10);
                } else {
                    overflow = (number1[i] + number2[i] + overflow) / 10;
                    inverted_result.add((number1[i] + number2[i] + overflow) % 10);
                }
            } else {
                inverted_result.add(number1[i] + number2[i] + overflow);
            }
        }
        if (overflow != 0){
            inverted_result.add(overflow);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = inverted_result.size() - 1; i >= 0; i--){
            result.add(inverted_result.get(i));
        }
        return result;
    }
}
