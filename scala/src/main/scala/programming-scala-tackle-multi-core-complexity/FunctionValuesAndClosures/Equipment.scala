class Equipment(val routine : Int => Int) {
  def simulate(input : Int) = {
    print("Running simulation...")
    routine(input)
  }
}

object Equipment {
  def main(args : Array[String]) : Unit = {
    val equipment0 = new Equipment({input => println("calc with " + input); input})
    val equipment1 = new Equipment({input => println("calc with " + input); input})

    equipment0.simulate(4);
    equipment1.simulate(6);
  }
}
