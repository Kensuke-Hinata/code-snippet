import java.util.Date

object Log {
  def log(date : Date, message : String) = {
    println(date + "----" + message)
  }

  def main(args : Array[String]) : Unit = {
    val date = new Date
    log(date, "message1")
    log(date, "message2")
    log(date, "message3")

    val logWithDateBound = log(new Date, _ : String)
    logWithDateBound("message1")
    logWithDateBound("message2")
    logWithDateBound("message3")
  } 
}
