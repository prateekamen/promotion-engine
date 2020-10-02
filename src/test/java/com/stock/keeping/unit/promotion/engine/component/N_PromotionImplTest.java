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

    @Test
    public void shouldCalculateForA(){
        when(stockKeepingUnit.getId()).thenReturn('A');
        verify(stockKeepingUnit.getId(), atLeast(1));
        Assert.assertEquals(new N_PromotionImpl().price(stockKeepingUnit,3),130);
    }

}