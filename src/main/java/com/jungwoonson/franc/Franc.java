package com.jungwoonson.franc;

import com.jungwoonson.Money;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        Franc dollar = (Franc) o;
        return amount == dollar.amount;
    }
}
