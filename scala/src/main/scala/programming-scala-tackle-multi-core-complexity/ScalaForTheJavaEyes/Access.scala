class Microwave {
  def start() = println("started")
  def stop() = println("stopped")
  private def turnTable() = println("turning table")
}

object Microwave {
  def main(args : Array[String]) = {
    val microware = new Microwave
    microware.start()
    microware.turnTable()
    microware.stop()
  }
}

//object OutsideMicrowave {
  //def main(args : Array[String]) = {
    //val microware = new Microwave
    //microware.start()
    //microware.turnTable()
    //microware.stop()
  //}
//}
