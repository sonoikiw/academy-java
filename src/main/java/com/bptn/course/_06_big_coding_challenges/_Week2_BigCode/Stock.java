package com.bptn.course._06_big_coding_challenges._Week2_BigCode;

public class Stock {
    // Instance variables
    private String tickerSymbol;
    private String companyName;
    private int price;
    private double percentChange;
    private int totalShares;
    private long marketCap;

    // Constructor to initialize instance variables
    public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
        this.tickerSymbol = tickerSymbol.toUpperCase(); // Convert tickerSymbol to uppercase
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
        this.percentChange = 0.0; // Default to 0
        this.marketCap = (long) price * totalShares; // Calculate marketCap
    }

    // Method to adjust the price and recalculate percentChange and marketCap
    public void adjustPrice(int change) {
        // Calculate percent change based on the old price (before the change)
        this.percentChange = ((double) change / this.price) * 100;
        
        // Adjust the price
        this.price += change;
        
        // Recalculate the marketCap
        this.marketCap = (long) this.price * this.totalShares;
    }

    // Override toString() method to print stock information
    @Override
    public String toString() {
        return "Ticker Symbol: " + this.tickerSymbol + "\n" +
               "Company: " + this.companyName + "\n" +
               "Current Price: $" + this.price + " (" + String.format("%.10f", this.percentChange) + "%)\n" +
               "Market Cap: $" + this.marketCap;
    }

    // The main method must remain unchanged
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }
}

