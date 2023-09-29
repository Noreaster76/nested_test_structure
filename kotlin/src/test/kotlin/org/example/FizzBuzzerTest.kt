package org.example

import org.spekframework.spek2.Spek
import kotlin.test.assertEquals

fun fizzbuzz(input: Int): String {
    return ""
}

object FizzBuzzerTest: Spek({
    group("fizzbuzz()") {

        group("given an integer divisible by 3") {
            group("but the integer is not divisible by 5") {
                test("returns fizz") {
                    assertEquals(fizzbuzz(3), "fizz")
                }
            }
            group("and the integer is divisible by 5") {
                group("and the integer is odd") {
                    test("returns fizzbuzz") {
                        assertEquals(fizzbuzz(45), "fizzbuzz")
                    }
                }
                group("and the integer is even") {
                    test("returns the input") {
                        assertEquals(fizzbuzz(90), "90")
                    }
                }
            }
        }
        group("given an integer not divisible by 3") {
            group("but the integer is divisible by 5") {
                test("returns buzz") {
                    assertEquals(fizzbuzz(5), "buzz")
                }
            }
            group("and the integer is not divisible by 5") {
                group("and the integer is not divisible by 7") {
                    test("returns the input") {
                        assertEquals(fizzbuzz(8), "8")
                    }
                }
                group("but the integer is divisible by 7") {
                    test("returns seven") {
                        assertEquals(fizzbuzz(7), "seven")
                    }
                }
            }
        }
    }
})
