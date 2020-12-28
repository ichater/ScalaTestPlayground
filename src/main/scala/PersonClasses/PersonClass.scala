package PersonClasses

 class Person(var firstName: String, var lastName: String, var age: Int){
  def introduction: String = s"Hello my name is ${firstName} ${lastName} and I am ${age} years old"
}



