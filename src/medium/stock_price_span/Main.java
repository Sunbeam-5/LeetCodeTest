package medium.stock_price_span;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        List<Integer> spans = new ArrayList<>();

        for (int price : prices) {
            int span = stockSpanner.next(price);
            spans.add(span);
        }

        System.out.println(spans);
    }
}