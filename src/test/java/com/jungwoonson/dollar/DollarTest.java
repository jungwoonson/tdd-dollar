package com.jungwoonson.dollar;

import org.junit.jupiter.api.Test;
class DollarTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}