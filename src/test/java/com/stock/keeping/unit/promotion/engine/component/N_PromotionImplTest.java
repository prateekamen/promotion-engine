package com.stock.keeping.unit.promotion.engine.component;


import com.stock.keeping.unit.promotion.engine.bean.StockKeepingUnit;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class N_PromotionImplTest {


    StockKeepingUnit stockKeepingUnitA = new StockKeepingUnit('A',50);
    StockKeepingUnit stockKeepingUnitB = new StockKeepingUnit('B',30);

    @Test
    public void shouldCalculateForA(){
        Assert.assertEquals(new N_PromotionImpl().price(stockKeepingUnitA,3),130);
    }

    @Test
    public void shouldCalculateForB(){
        Assert.assertEquals(new N_PromotionImpl().price(stockKeepingUnitB,2),45);
    }


}