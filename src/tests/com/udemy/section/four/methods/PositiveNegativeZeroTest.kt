package com.udemy.section.four.methods

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PositiveNegativeZeroTest {

    private val positiveNegativeZero: PositiveNegativeZero = PositiveNegativeZero()

    @Test
    fun testCheckNumber(){
        assertEquals(positiveNegativeZero.checkNumber(5), "positive")
        assertEquals(positiveNegativeZero.checkNumber(-4), "negative")
        assertEquals(positiveNegativeZero.checkNumber(0), "zero")
    }
}