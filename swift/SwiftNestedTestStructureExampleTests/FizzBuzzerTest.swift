import Quick
import Nimble

func fizzbuzz(_ input: Int) -> String {
  return ""
}

final class FizzBuzzerTest: QuickSpec {

  override func spec() {

    describe("fizzbuzz()") {

      describe("given an integer divisible by 3") {
        describe("but the integer is not divisible by 5") {
          it("returns fizz") {
            expect(fizzbuzz(3)).to(equal("fizz"))
          }
        }
        describe("and the integer is divisible by 5") {
          describe("and the integer is odd") {
            it("returns fizzbuzz") {
              expect(fizzbuzz(45)).to(equal("fizzbuzz"))
            }
          }
          describe("and the integer is even") {
            it("returns the input") {
              expect(fizzbuzz(90)).to(equal("90"))
            }
          }
        }
      }
      describe("given an integer not divisible by 3") {
        describe("but the integer is divisible by 5") {
          it("returns buzz") {
            expect(fizzbuzz(5)).to(equal("buzz"))
          }
        }
        describe("and the integer is not divisible by 5") {
          describe("and the integer is not divisible by 7") {
            it("returns the input") {
              expect(fizzbuzz(8)).to(equal("8"))
            }
          }
          describe("but the integer is divisible by 7") {
            it("returns seven") {
              expect(fizzbuzz(7)).to(equal("seven"))
            }
          }
        }
      }
    }
  }
}
