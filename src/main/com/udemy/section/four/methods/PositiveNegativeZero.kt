package com.udemy.section.four.methods

class PositiveNegativeZero {
    fun checkNumber(a: Int) =
        when {
            a > 0 -> "positive"
            a < 0 -> "negative"
            else -> "zero"
        }
}