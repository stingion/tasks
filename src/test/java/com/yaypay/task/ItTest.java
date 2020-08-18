package com.yaypay.task;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ItTest {

    @Test
    public void testGet() {
        assertEquals("abc", new It().get());
    }
}