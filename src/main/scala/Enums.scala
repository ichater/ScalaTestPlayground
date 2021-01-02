object Enums {

  trait TrafficLight

  case object Red extends TrafficLight
  case object Green extends TrafficLight
  case object Yellow extends TrafficLight

  trait GenderedPerson{
    val isMan: Boolean
  }

  case class Female(name: String) extends GenderedPerson {
    val isMan = false
  }
  case class Male(name: String) extends GenderedPerson {
    val isMan = true
  }

  val izaak: GenderedPerson = Male("izaak")

  def doSomething(t: TrafficLight): String = t match {
    case Green => "green"
    case Red =>"red"
  }

}
