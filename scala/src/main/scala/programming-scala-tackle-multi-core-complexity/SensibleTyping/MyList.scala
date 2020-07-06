class MyList[+T]

object MyList {
  def main(args : Array[String]) : Unit = {
    var list0 = new MyList[Int]
    var list1 : MyList[Any] = null

    list1 = list0
  }
}
