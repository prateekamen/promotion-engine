package com.stock.keeping.unit.promotion.engine.abstraction;

import com.stock.keeping.unit.promotion.engine.bean.StockKeepingUnit;

public interface AddPromotion {
    int finalPrice(StockKeepingUnit stockKeepingUnit1, StockKeepingUnit stockKeepingUnit2);
}
