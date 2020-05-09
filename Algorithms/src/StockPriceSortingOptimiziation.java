import Model.StockObject;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public class StockPriceSortingOptimiziation {

    public static void main(String[] args) {
        LinkedHashMap<String, TreeSet<StockObject>>  stockValues = StockObject.populateData();
        stockValues.forEach(StockPriceSortingOptimiziation::accept);
    }

    private static void accept(String day, TreeSet<StockObject> stockValue) {
        System.out.println("On Day " + day + ", below are the stock values");
        stockValue.forEach(stock ->
            System.out.println("Value =" + stock.getStockPrice() + " :: Time at which it was traded =" + new Date(stock.getTimeOfStock()))
        );
    }
}
