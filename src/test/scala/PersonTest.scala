import PersonClasses.Person
import PersonClasses.Person.{capitalizeName, changePersonsAge, mkPerson, oldestPerson, sortByAge, sortByFirstName, youngestPerson}
import PersonClasses.PersonList.personList
import org.scalatest.FunSuite


class PersonTest extends FunSuite {
  test("personclass.person") {
    val izaakChater = new Person("Izaak", "Chater", 31)
    assert(izaakChater.introduction === "Hello my name is Izaak Chater and I am 31 years old")
  }

  test("Oldest Person function") {
    assert(oldestPerson(personList) === Some(
      Person("Alistair", "Gray", 78)))
  }

  test("youngest Person function") {
    assert(youngestPerson(personList) === Some(Person("Generic", "Infant", 2)))
  }

  test("sort by age test") {
    assert(sortByAge(personList)(0) === Person("Generic", "Infant", 2))
  }

  test("sort by name test") {
    assert(sortByFirstName(personList)(0) === Person("Alistair", "Gray", 78))
  }

  test("Makes new person if right params are put in"){
    assert(mkPerson("Kim", "Kardashian", 39)=== Some(Person("Kim","Kardashian", 39)))
  }

  test("Makes new person if right params are put in and capitalize works"){
    assert(mkPerson("kIm", "kArdashian", 39)=== Some(Person("Kim","Kardashian", 39)))
  }

  test("None if wrong params are put in"){
    assert(mkPerson("", "", -30)=== None)
  }

  test("Capitalize name works"){
    assert(capitalizeName("iAMNoTCAPS")=== "Iamnotcaps")
  }

  test("changes age with changePersonsAge"){
    assert(changePersonsAge(Person("Stephen", "Wood", 32), 30)=== Some(Person("Stephen", "Wood", 30)) )
  }
  test("returns NONE if incorrect person put in"){
    assert(changePersonsAge(Person("Stephen", "", -32), 30)=== None )
  }
  test("functions as first class citizens"){
    assert(changePersonsAge(mkPerson("kIm", "kArdashian", 39), 30)=== None )
  }
}
