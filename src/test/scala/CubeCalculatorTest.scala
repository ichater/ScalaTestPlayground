import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }
  test("CubeCalculator.square") {
    assert(CubeCalculator.square(9) === 81)
  }

}