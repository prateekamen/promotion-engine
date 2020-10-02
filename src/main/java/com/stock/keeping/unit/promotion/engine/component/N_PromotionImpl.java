package com.stock.keeping.unit.promotion.engine.component;

import com.stock.keeping.unit.promotion.engine.abstraction.N_Promotion;
import com.stock.keeping.unit.promotion.engine.bean.StockKeepingUnit;

public class N_PromotionImpl implements N_Promotion {

    @Override
    public boolean isActive() {
        return true;
    }

    @Override
    public int price(StockKeepingUnit stockKeepingUnit, int units) {
        if(stockKeepingUnit.getId()=='A' && units==3)
            return 130;
        if(stockKeepingUnit.getId()=='B' && units==2)
            return 45;
        return stockKeepingUnit.getPrice()*units;
    }
}
