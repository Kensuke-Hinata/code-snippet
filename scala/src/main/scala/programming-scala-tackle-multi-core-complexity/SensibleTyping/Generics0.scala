import java.util._

object Generics0 {
  def main(args : Array[String]) : Unit = {
    var list0 : List[Int] = new ArrayList[Int]
    var list1 = new ArrayList[Int]
    
    list1 add 0
    list1 add 1

    var total = 0
    var index = 0
    for (index <- 0 until list1.size) {
      total += list1 get index
    }

    println("Total is " + total)
  }
}
