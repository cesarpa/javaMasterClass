package com.udemy.section.four.methods

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SpeedConverterTest {

    private val speedConverter: SpeedConverter = SpeedConverter()

    @Test
    fun speedConverterTest(){
        assertEquals(speedConverter.toMilesPerHour(-5.0), -1)
        assertEquals(speedConverter.toMilesPerHour(80.0), 49.71)
    }
}