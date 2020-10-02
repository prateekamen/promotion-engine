package com.stock.keeping.unit.promotion.engine.component;


import com.stock.keeping.unit.promotion.engine.bean.StockKeepingUnit;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
class N_PromotionImplTest {

    @Mock
    StockKeepingUnit stockKeepingUnit;
    StockKeepingUnit stockKeepingUnitA = new StockKeepingUnit('A',50);
    StockKeepingUnit stockKeepingUnitB = new StockKeepingUnit('A',50);

    @Test
    public void shouldCalculateForA(){
        stockKeepingUnit = mock(StockKeepingUnit.class);
        when(stockKeepingUnit.getId()).thenReturn('A');
        verify(stockKeepingUnit.getId(),atLeastOnce());
        Assert.assertEquals(new N_PromotionImpl().price(stockKeepingUnit,3),130);
    }

    @Test
    public void shouldCalculateForB(){
        Assert.assertEquals(new N_PromotionImpl().price(stockKeepingUnitB,2),130);
    }

}