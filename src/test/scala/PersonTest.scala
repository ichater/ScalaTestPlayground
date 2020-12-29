import PersonClasses.Person
import PersonClasses.PersonClasses.izaakChater
import PersonClasses.PersonFunctions.{oldestPerson, youngestPerson}
import PersonClasses.PersonList.personList
import org.scalatest.FunSuite


class PersonTest extends FunSuite {
  test("personclass.person") {
    assert(izaakChater.introduction === "Hello my name is Izaak Chater and I am 31 years old")
  }

  test("Oldest Person function") {
    assert(oldestPerson(personList) === ("Alistair", "Gray", 78))
  }

  test("youngest Person function") {
    assert(youngestPerson(personList) === ("Generic", "Infant", 2))
  }
}
