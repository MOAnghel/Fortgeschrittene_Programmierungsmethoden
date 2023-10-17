public class Problem4 {
    public static int getCheapest(int[] list){
        int the_cheapest = list[0];
        for (int i = 1; i < list.length; i++){
            if(list[i] < the_cheapest){
                the_cheapest = list[i];
            }
        }
        return the_cheapest;
    }

    public static int getMostExpensive(int[] keyboards, int[] usbs){
        int the_most_expensive = 0;
        for (int i = 0; i < keyboards.length; i++){
            if (keyboards[i] > the_most_expensive){
                the_most_expensive = keyboards[i];
            }
        }
        for (int i = 0; i < usbs.length; i++){
            if (usbs[i] > the_most_expensive){
                the_most_expensive = usbs[i];
            }
        }
        return the_most_expensive;
    }

    public static int getMostExpensiveInBudget(int[] prices, int budget){
        int in_budget = 0;
        int least_difference = 0;
        for (int i = 0; i < prices.length; i++){
            if (prices[i] < budget){
                if (least_difference != 0 && least_difference < budget - prices[i]){
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
}
