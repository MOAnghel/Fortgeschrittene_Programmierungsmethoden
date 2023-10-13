public class Problem2 {
    public static int problem1(int[] numbers){
        int max = 0;
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }

    public static int problem2(int[] numbers){
        int min = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }

    public static int problem3(int[] numbers){
        int max_sum = 0;
        for(int i = 0; i < numbers.length; i++){
            max_sum += numbers[i];
        }
        int min = problem2(numbers);
        return max_sum - min;
    }

    public static int problem4(int[] numbers){
        int max_sum = 0;
        for(int i = 0; i < numbers.length; i++){
            max_sum += numbers[i];
        }
        int max = problem1(numbers);
        return max_sum - max;
    }
}
