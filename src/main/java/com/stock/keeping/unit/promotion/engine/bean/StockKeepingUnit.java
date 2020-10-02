package com.stock.keeping.unit.promotion.engine.bean;

public final class StockKeepingUnit {
    private final char id;

    private final int price;

    public StockKeepingUnit(char id, int price) {
        this.id = id;
        this.price = price;
    }

    public char getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

}
