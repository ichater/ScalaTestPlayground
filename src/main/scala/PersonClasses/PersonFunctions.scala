package PersonClasses
import PersonList.personList

object PersonFunctions {
  def youngestPerson(personList: List[Person]):Person = personList.filter(person => person.age==personList.map(person => person.age).min)(0)


  def oldestPerson(personList: List[Person]):Person = personList.filter(person => person.age==personList.map(person => person.age).max)(1)
  def sortByAge(personList: List[Person]):Person = personList(1)
  def sortByFirstName(personList: List[Person]):Person = personList(1)

  println(oldestPerson(personList))
}
