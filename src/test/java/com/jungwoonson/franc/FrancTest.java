package com.jungwoonson.franc;

import org.junit.jupiter.api.Test;

class FrancTest {

    @Test
    public void testMultiplication() {
        Franc five = new Franc(5);
        Franc product = five.times(2);
        assertEquals(new Franc(10), product);
        product = five.times(3);
        assertEquals(new Franc(15), product);
    }

    @Test
    public void testEquality() {
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
    }
}