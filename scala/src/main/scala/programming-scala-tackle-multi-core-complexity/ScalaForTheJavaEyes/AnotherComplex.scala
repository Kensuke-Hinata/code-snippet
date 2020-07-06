class AnotherComplex(val real : Int, val imaginary : Int) {
  def +(operand : AnotherComplex) : AnotherComplex = {
    println("Calling +")
    new AnotherComplex(real + operand.real, imaginary + operand.imaginary)
  }

  def *(operand : AnotherComplex) : AnotherComplex = {
    println("Calling *")
    new AnotherComplex(real * operand.real - imaginary * operand.imaginary,
      real * operand.imaginary + imaginary * operand.real)
  }

  override def toString() : String = {
    real + (if (imaginary < 0) "" else "+") + imaginary + "i"
  }
}

object AnotherComplex {
  def main(args : Array[String]) = {
    val c0 = new AnotherComplex(1, 4)
    val c1 = new AnotherComplex(2, -3)
    val c2 = new AnotherComplex(2, 2)
    println(c0 + c1 * c2)
  }
}
