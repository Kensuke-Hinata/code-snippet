/*import akka.actor.Actor*/
//import akka.actor.ReceiveTimeout
//import scala.concurrent.duration._

//class MyActor extends Actor {
  //def receive = {
    //case (symbol : String, price : Double) =>
      //if (price > previousHigh._2) (symbol, price) else previousHigh
  //}
//}

//class TopStock {
  //def main(args : Array[String]) = {
    //val symbols = List("AAPL", "GOOG", "IBM", "JAVA", "MSFT")
    //val year = 2018

    //symbols.foreach { symbol =>
      //Actor { receiver ! getYearEndClosing(symbol, year) }
    //}

    //val (topStock, highestPrice) = getTopStock(symbols.length)

    //printf("Top stock of %d is %s closing at price %f\n", year, topStock, highestPrice)
  //}

  //def getYearEndClosing(symbol : String, year : Int) = {
    //val url = "http://ichart.finance.yahoo.com/table.csv?s=" +
    //symbol + "&a=11&b=0&c=" + year + "&d=11&e=31&f=" + year + "&g=m"
    //val data = io.Source.fromURL(url).mkString
    //val price = data.split("\n")(1).split(",")(4).toDouble
    //(symbol, price)
  //}

  //def getTopStock(count : Int) : (String, Double) = {
    //(1 to count).foldLeft("", 0.0) { (previousHigh, index) => 
      //receiveWithin(10000) {
        //case (symbol : String, price : Double) =>
          //if (price > previousHigh._2) (symbol, price) else previousHigh
      //}
    //}
  //}
/*}*/
