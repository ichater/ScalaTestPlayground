package PersonClasses



case class Person( firstName: String,  lastName: String,  age: Int) {
  def introduction: String = s"Hello my name is ${firstName} ${lastName} and I am ${age} years old"
 }

object Person {
 def youngestPerson(personList: List[Person]):Option[Person] = personList.sortBy(person => person.age).headOption
 def oldestPerson(personList: List[Person]):Option[Person] = personList.sortBy(person => person.age).reverse.headOption
 def sortByAge(personList: List[Person]): List[Person] = personList.sortBy(_.age)
 def sortByFirstName(personList: List[Person]): List[Person] = personList.sortBy(_.firstName)
 def capitalizeName (name:String): String = name.toLowerCase.split(' ').map(_.capitalize).mkString(" ")
 def mkPerson(firstName: String,lastName: String, age: Int): Option[Person] = {
  if (firstName == "" | lastName == "" | age < 0) None else Some(Person(capitalizeName(firstName), capitalizeName(lastName), age))
 }
 def changePersonsAge(oldPerson: Person, newAge: Int): Option[Person] ={
  if (oldPerson.firstName == "" | oldPerson.lastName == "" | oldPerson.age < 0) None
  else Some(Person(oldPerson.firstName, oldPerson.lastName, newAge ))
 }
}



