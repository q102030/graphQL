package com.graphql.graphqldemo.model;

public class StockDetails {
    private String ticker;

    private String stockValue;

    private String volume;

    private String averageVolume;

    private String PE_Ratio;

    private String EPS;

    private String dividend;

    private String marketCap;

    private String previousOpen;

    private String previousClose;

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getStockValue() {
        return stockValue;
    }

    public void setStockValue(String stockValue) {
        this.stockValue = stockValue;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getAverageVolume() {
        return averageVolume;
    }

    public void setAverageVolume(String averageVolume) {
        this.averageVolume = averageVolume;
    }

    public String getPE_Ratio() {
        return PE_Ratio;
    }

    public void setPE_Ratio(String PE_Ratio) {
        this.PE_Ratio = PE_Ratio;
    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public String getDividend() {
        return dividend;
    }

    public void setDividend(String dividend) {
        this.dividend = dividend;
    }

    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }

    public String getPreviousOpen() {
        return previousOpen;
    }

    public void setPreviousOpen(String previousOpen) {
        this.previousOpen = previousOpen;
    }

    public String getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(String previousClose) {
        this.previousClose = previousClose;
    }
}
