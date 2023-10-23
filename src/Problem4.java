import java.util.ArrayList;
import java.util.List;

public class Problem4 {
    public static int getCheapest(int[] list) {
        int the_cheapest = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < the_cheapest) {
                the_cheapest = list[i];
            }
        }
        return the_cheapest;
    }

    public static int getMostExpensive(int[] keyboards, int[] usbs) {
        int the_most_expensive = 0;
        for (int i = 0; i < keyboards.length; i++) {
            if (keyboards[i] > the_most_expensive) {
                the_most_expensive = keyboards[i];
            }
        }
        for (int i = 0; i < usbs.length; i++) {
            if (usbs[i] > the_most_expensive) {
                the_most_expensive = usbs[i];
            }
        }
        return the_most_expensive;
    }

    public static int getMostExpensiveInBudget(int[] prices, int budget) {
        int in_budget = 0;
        int least_difference = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < budget) {
                if (least_difference != 0 && least_difference < budget - prices[i]) {
                    least_difference = budget - prices[i];
                    in_budget = prices[i];
                } else {
                    least_difference = budget - prices[i];
                    in_budget = prices[i];
                }
            }
        }
        return in_budget;
    }

    public static int getBestMatchInBudget(int[] keyboard_prices, int[] pen_drive_prices, int budget) {
        List<Integer> best_match = new ArrayList<>(2);
        int best_in_budget = 0;
        for (int i = 0; i < keyboard_prices.length; i++) {
            int keyboard_price = keyboard_prices[i];
            for (int j = 0; j < pen_drive_prices.length; j++) {
                if (keyboard_price + pen_drive_prices[j] <= budget && budget - (keyboard_price + pen_drive_prices[j]) <= budget - best_in_budget) {
                    best_match.add(0, keyboard_prices[i]);
                    best_match.add(1, pen_drive_prices[j]);
                    best_in_budget = keyboard_price + pen_drive_prices[j];
                }
            }
        }
        if (best_in_budget == 0){
            return -1;
        }
        return best_match.get(0) + best_match.get(1);
    }
}
