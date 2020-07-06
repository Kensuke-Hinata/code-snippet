class Complex(val real : Int, val imaginary : Int) {
  def +(operand : Complex) : Complex = {
    new Complex(real + operand.real, imaginary + operand.imaginary)
  }

  override def toString() : String = {
    real + (if (imaginary < 0) "" else "+") + imaginary + "i"
  }
}

object Complex {
  def main(args : Array[String]) = {
    val c0 = new Complex(1, 2)
    val c1 = new Complex(2, -3)
    val sum = c0 + c1
    println("(" + c0 + ") + (" + c1 + ") = " + sum)
  }
}
