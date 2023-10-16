import java.util.ArrayList;

public class Problem3 {
    public static ArrayList<Integer> problem1(int[] number1, int[] number2) {
        int overflow = 0;
        ArrayList<Integer> inverted_result = new ArrayList<>();
        for (int i = number1.length - 1; i >= 0; i--) {
            if (number1[i] + number2[i] + overflow >= 10) {
                if (overflow == 0) {
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
        if (overflow != 0) {
            inverted_result.add(overflow);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = inverted_result.size() - 1; i >= 0; i--) {
            result.add(inverted_result.get(i));
        }
        return result;
    }

    public static ArrayList<Integer> problem2(int[] number1, int[] number2) {
        ArrayList<Integer> inverted_result = new ArrayList<>();
        for (int i = number1.length - 1; i >= 0; i--) {
            if (number1[i] < number2[i]) {
                if (i > 0 && i < number1.length - 1) {
                    number1[i - 1] -= 1;
                    inverted_result.add(10 + number1[i] - number2[i]);
                }

            } else {
                inverted_result.add(number1[i] - number2[i]);
            }
        }
        ArrayList<Integer> result = new ArrayList<>(inverted_result.size());
        for (int i = inverted_result.size() - 1; i >= 0; i--) {
            result.add(inverted_result.get(i));
        }
        return result;
    }

    public static ArrayList<Integer> problem3(int[] number1, int multiplier) {
        int overflow = 0;
        ArrayList<Integer> inverted_result = new ArrayList<>();
        for (int i = number1.length - 1; i >= 0; i--) {
            if (number1[i] * multiplier >= 10) {
                overflow = (number1[i] * multiplier) / 10;
                inverted_result.add((number1[i] * multiplier) % 10);
            } else {
                inverted_result.add((number1[i] * multiplier) % 10 + overflow);
                overflow = 0;
            }
        }

        ArrayList<Integer> result = new ArrayList<>(inverted_result.size());
        for (int i = inverted_result.size() - 1; i >= 0; i--) {
            result.add(inverted_result.get(i));
        }
        return result;
    }

    public static ArrayList<Integer> problem4(int[] number1, int divisor){
        int remainder;
        ArrayList<Integer> inverted_result = new ArrayList<>();
        for ( int i = 0; i < number1.length; i++){
            if (number1[i] % divisor != 0){
                remainder = number1[i] % divisor;
                number1[i + 1] = remainder * 10 + number1[i + 1];
                inverted_result.add(number1[i] / divisor );
            } else {
                inverted_result.add(number1[i] / divisor);
            }
        }

        return inverted_result;
    }
}
