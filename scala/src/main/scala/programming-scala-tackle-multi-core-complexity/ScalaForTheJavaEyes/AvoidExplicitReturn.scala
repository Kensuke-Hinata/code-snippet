object AvoidExplicitReturn {
  def check0() = true

  def check1() : Boolean = return true

  def main(args : Array[String]) = {
    println(check0)
    println(check1)
  }
}
