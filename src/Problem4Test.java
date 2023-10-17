import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void getCheapest() {
        int [] keyboards = {40,35,70,15,45};
        int result = Problem4.getCheapest(keyboards);
        assert (result == 15);
    }

    @Test
    void getMostExpensive() {
        int [] keyboards = {15,20,10,35};
        int [] usb = {20,15,40,15};
        int result = Problem4.getMostExpensive(keyboards,usb);
        assert (result == 40);
    }

    @Test
    void getMostExpensiveInBudget() {
        int [] prices = {15, 45, 20};
        int budget = 30;
        int result = Problem4.getMostExpensiveInBudget(prices,budget);
        assert (result == 20);
    }
}