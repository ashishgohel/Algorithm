package Model;

import java.util.*;

public class StockObject {

    private Double stockPrice;

    private Long timeOfStock;

    public StockObject(){}

    private StockObject(Double stockPrice, Long timeOfStock) {
        this.stockPrice = stockPrice;
        this.timeOfStock = timeOfStock;
    }

    public Double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(Double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public Long getTimeOfStock() {
        return timeOfStock;
    }

    public void setTimeOfStock(Long timeOfStock) {
        this.timeOfStock = timeOfStock;
    }

    @Override
    public boolean equals(Object stockObj) {
        if (!(stockObj instanceof StockObject)) {
            return false;
        }
        StockObject currObj = (StockObject) stockObj;
        return stockPrice.equals(currObj.stockPrice) && timeOfStock.equals(currObj.timeOfStock);
    }

    @Override
    public int hashCode() {
        return stockPrice.intValue() * 31 + timeOfStock.hashCode() * 17;
    }


    @Override
    public String toString() {
        return "StockObject{" +
                "stockPrice=" + stockPrice +
                ", Time of Stock ='" + timeOfStock + '\'' +
                '}';
    }

    private static Date getTime(int day, int hour){
        Calendar cal = Calendar.getInstance();
        cal.set(2020,Calendar.MAY,day);
        cal.set(Calendar.HOUR_OF_DAY,hour);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        cal.set(Calendar.MILLISECOND,0);
        return cal.getTime();
    }

    public static LinkedHashMap<String,TreeSet<StockObject>> populateData(){
        LinkedHashMap<String,TreeSet<StockObject>> stockDbValues = new LinkedHashMap<>();
        for (int i = 1; i < 30; i++) {
            TreeSet<StockObject> sortedSet = new TreeSet<>(Comparator.comparing(StockObject::getStockPrice).thenComparing(StockObject::getTimeOfStock));
            for (int j = 9; j < 16; j++) {
                sortedSet.add(new StockObject(Math.random(),getTime(i,j).getTime()));
            }
            stockDbValues.put(new StringBuilder().append("May ").append(i).append(" 2020 ").toString(),sortedSet);
        }
        return stockDbValues;
    }

}
