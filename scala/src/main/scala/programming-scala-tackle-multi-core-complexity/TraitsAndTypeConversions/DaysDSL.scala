import DateHelper._

object DaysDSL {
  def main(args : Array[String]) : Unit = {
    val past = 2 days ago
    val appointment = 5 days from_now

    println(past)
    println(appointment)
  }
}
