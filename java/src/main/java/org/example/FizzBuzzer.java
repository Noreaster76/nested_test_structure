package org.example;

public class FizzBuzzer {

  public static String go(final int input) {
    if (input % 3 == 0) {
      if (input % 5 == 0) {
        if (input % 2 == 0) {
          return String.valueOf(input);
        } else {
          return "fizzbuzz";
        }
      } else {
        return "fizz";
      }
    } else {
      if (input % 5 == 0) {
        return "buzz";
      } else {
        if (input % 7 != 0) {
          return String.valueOf(input);
        } else {
          return "seven";
        }
      }
    }
  }
}
