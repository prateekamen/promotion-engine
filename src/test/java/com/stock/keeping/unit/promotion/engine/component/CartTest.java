package com.stock.keeping.unit.promotion.engine.component;

import com.stock.keeping.unit.promotion.engine.bean.StockKeepingUnit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class CartTest {

    private Map<StockKeepingUnit,Integer> stockKeepingUnitMap;
    StockKeepingUnit stockKeepingUnitA, stockKeepingUnitB,stockKeepingUnitC, stockKeepingUnitD;
    Cart cart;
    @Before
    public void init(){
         stockKeepingUnitA = new StockKeepingUnit('A',50);
         stockKeepingUnitB = new StockKeepingUnit('B',30);
         stockKeepingUnitC = new StockKeepingUnit('C',20);
         stockKeepingUnitD = new StockKeepingUnit('D',15);
    }

    @Test
    public void scenarioA(){

        stockKeepingUnitMap = new HashMap<>();
        stockKeepingUnitMap.put(stockKeepingUnitA,1);
        stockKeepingUnitMap.put(stockKeepingUnitB,1);
        stockKeepingUnitMap.put(stockKeepingUnitC,1);

        Assert.assertEquals(cart.compute(stockKeepingUnitMap),100);

    }
}