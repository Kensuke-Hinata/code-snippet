package EquipmentUseDry0 {
  class Equipment(val routine : Int => Int) {
    def simulate(input : Int) = {
      print("Running simulation...")
      routine(input)
    }
  }

  object EquipmentUseDry {
    def main(args : Array[String]) : Unit = {
      val calculator = {input : Int => println("calc with " + input); input}
      val equipment0 = new Equipment(calculator)
      val equipment1 = new Equipment(calculator)

      equipment0.simulate(4);
      equipment1.simulate(6);
    }
  }
}
