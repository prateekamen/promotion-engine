package com.stock.keeping.unit.promotion.engine.component;

import com.stock.keeping.unit.promotion.engine.bean.StockKeepingUnit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.*;

class CartTest {

    private List<Character> stockKeepingUnitList;

    private Map<Character,Integer> stockKeepingUnitMap;
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

        stockKeepingUnitList = new ArrayList<>(Arrays.asList('A','B','C'));

        stockKeepingUnitMap = new HashMap<>();
        for(Character c: stockKeepingUnitList){
            Integer i = stockKeepingUnitMap.get(c);
            stockKeepingUnitMap.put(c, (i==null)? 1 : i+1);
        }



        Assert.assertEquals(cart.compute(stockKeepingUnitMap),100);

    }
}