object Inject0 {
  def inject(arr : Array[Int], initial : Int,
    operation : (Int, Int) => Int) : Int = {
    var carryOver = initial
    arr.foreach(element => carryOver = operation(carryOver, element))

    carryOver
  }

  def main(args : Array[String]) : Unit = {
    val arr = Array(2, 3, 5, 1, 6, 4)
    val sum = inject(arr, 0, (carryOver, elem) => carryOver + elem)
    println("Sum of elements in array " + arr.toString + " is " + sum)
  }
}
