package static {
  class Marker private (val color : String) {
    override def toString() : String = "marker color " + color
  }

  object Marker {
    private val markers = Map(
      "red" -> new Marker("red"),
      "blue" -> new Marker("blue"),
      "green" -> new Marker("green")
      )

    def primaryColors = "red, green, blue"

    def apply(color : String) =
      if (markers.contains(color)) markers(color) else null

    def main(args : Array[String]) : Unit = {
      println("Primary colors are : " + Marker.primaryColors)
      println(Marker("blue"))
      println(Marker("red"))
      println(Marker("yellow"))
    }
  }
}
