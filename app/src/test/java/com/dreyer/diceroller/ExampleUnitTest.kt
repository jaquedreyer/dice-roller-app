package com.dreyer.diceroller

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

//As the rollResult are random numbers, the test only check if the rollResult is between the int range
class ExampleUnitTest {
    @Test
    fun generates_numbers() {
        val dice = Dice(6)
        val rollResult = dice.roll()
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6 )
    }
}