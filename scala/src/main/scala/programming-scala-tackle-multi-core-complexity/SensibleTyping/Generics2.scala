import java.util._

object Generics2 {
  def main(args : Array[String]) : Unit = {
    var list0 = new ArrayList[Int]
    var list1 = new ArrayList[Any]

    var ref0 : Int = 1
    var ref1 : Any = null

    ref1 = ref0

    //list1 = list0
  }
}
