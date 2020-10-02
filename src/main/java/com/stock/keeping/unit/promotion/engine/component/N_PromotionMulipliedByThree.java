package com.stock.keeping.unit.promotion.engine.component;

import com.stock.keeping.unit.promotion.engine.abstraction.N_Promotion;

public class N_PromotionMulipliedByThree implements N_Promotion {

    @Override
    public boolean isActive() {
        return true;
    }
}
