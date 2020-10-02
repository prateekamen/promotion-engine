package com.stock.keeping.unit.promotion.engine.component;

import com.stock.keeping.unit.promotion.engine.abstraction.AddPromotion;
import com.stock.keeping.unit.promotion.engine.bean.StockKeepingUnit;

public class AddPromotionImpl implements AddPromotion {
    @Override
    public int finalPrice(StockKeepingUnit stockKeepingUnit1, StockKeepingUnit stockKeepingUnit2) {
        if(stockKeepingUnit1.getId()=='C' && stockKeepingUnit2.getId()=='D'){
            return 30;
        }
        return stockKeepingUnit1.getPrice()+stockKeepingUnit2.getPrice();
    }
}
