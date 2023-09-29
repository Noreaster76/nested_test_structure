package org.example;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class FizzBuzzerTest
{

    @Nested
    @DisplayName("given an integer divisible by 3")
    class IntegerDivisibleBy3Test {

        @Nested
        @DisplayName("but the integer is not divisible by 5")
        class IntegerNotDivisibleBy5Test {

            @Test
            @DisplayName("it returns 'fizz'")
            void returnsFizz() {
                assertThat(FizzBuzzer.go(3), is("fizz"));
            }
        }

        @Nested
        @DisplayName("and the integer is divisible by 5")
        class IntegerDivisibleBy5Test {

            @Nested
            @DisplayName("and the integer is odd")
            class IntegerIsOddTest {

                @Test
                @DisplayName("it returns 'fizzbuzz'")
                void returnsFizzBuzz() {
                    assertThat(FizzBuzzer.go(45), is("fizzbuzz"));
                }
            }

            @Nested
            @DisplayName("and the integer is even")
            class IntegerIsEvenTest {

                @Test
                @DisplayName("it returns the input")
                void returnsTheInput() {
                    assertThat(FizzBuzzer.go(90), is("90"));
                }
            }
        }
    }

    @Nested
    @DisplayName("given an integer not divisible by 3")
    class IntegerNotDivisibleBy3Test {

        @Nested
        @DisplayName("and the integer is not divisible by 5")
        class IntegerNotDivisibleBy5Test {

            @Test
            @DisplayName("it returns 'buzz'")
            void returnsBuzz() {
                assertThat(FizzBuzzer.go(5), is("buzz"));
            }
        }

        @Nested
        @DisplayName("and the integer is divisible by 5")
        class IntegerDivisibleBy5Test {

            @Nested
            @DisplayName("and the integer is not divisible by 7")
            class IntegerNotDivisibleBy7Test {

                @Test
                @DisplayName("it returns the input")
                void returnsTheInput() {
                    assertThat(FizzBuzzer.go(8), is("8"));
                }
            }

            @Nested
            @DisplayName("but the integer is divisible by 7")
            class IntegerDivisibleBy7Test {

                @Test
                @DisplayName("it returns 'seven'")
                void returnsSeven() {
                    assertThat(FizzBuzzer.go(7), is("seven"));
                }
            }
        }
    }
}
