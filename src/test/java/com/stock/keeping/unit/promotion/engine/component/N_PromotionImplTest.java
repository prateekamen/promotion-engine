package com.stock.keeping.unit.promotion.engine.component;


import com.stock.keeping.unit.promotion.engine.bean.StockKeepingUnit;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class N_PromotionImplTest {

    StockKeepingUnit stockKeepingUnit;

    @Test
    public void shouldCalculateForA(){
        stockKeepingUnit = new StockKeepingUnit('A',50);
        Assert.assertEquals(new N_PromotionImpl().price(stockKeepingUnit,3),130);
    }

    @Test
    public void shouldCalculateForB(){
        stockKeepingUnit = new StockKeepingUnit('B',30);
        Assert.assertEquals(new N_PromotionImpl().price(stockKeepingUnit,2),45);
    }


}