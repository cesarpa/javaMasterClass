package com.udemy.section.four.methods

import kotlin.math.round

class SpeedConverter {
    fun toMilesPerHour(kilometersPerHour: Double) =
        if (kilometersPerHour < 0) -1 else round(kilometersPerHour * 0.621371 * 100) / 100
}