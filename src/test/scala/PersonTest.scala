import PersonClasses.PersonClasses.izaakChater
import org.scalatest.FunSuite

class PersonTest extends FunSuite {
  test("personclass.person") {
    assert(izaakChater.introduction === "Hello my name is Izaak Chater and I am 31 years old")
  }
}
