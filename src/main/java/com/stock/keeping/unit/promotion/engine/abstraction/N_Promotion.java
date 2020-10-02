package com.stock.keeping.unit.promotion.engine.abstraction;

import com.stock.keeping.unit.promotion.engine.bean.StockKeepingUnit;

public interface N_Promotion extends Promotion{
    int price(StockKeepingUnit stockKeepingUnit, int units);
}
