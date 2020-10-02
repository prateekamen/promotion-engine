package com.stock.keeping.unit.promotion.engine.component;

import com.stock.keeping.unit.promotion.engine.bean.StockKeepingUnit;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class AddPromotionImplTest {
    StockKeepingUnit stockKeepingUnitC = new StockKeepingUnit('C', 20);
    StockKeepingUnit stockKeepingUnitD = new StockKeepingUnit('D',15);

    @Test
    public void shouldCalculateForCAndD(){
        Assert.assertEquals(new AddPromotionImpl().finalPrice(stockKeepingUnitC,stockKeepingUnitD),30);
    }

}