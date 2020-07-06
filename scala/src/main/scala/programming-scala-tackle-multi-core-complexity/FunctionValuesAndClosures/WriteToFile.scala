import java.io._

object WriteToFile {
  def writeToFile(fileName : String)(codeBlock : PrintWriter => Unit) = {
    val writer = new PrintWriter(new File(fileName))
    try {
      codeBlock(writer)
    }
    finally {
      writer.close
    }
  }

  def main(args : Array[String]) : Unit = {
    writeToFile("output") {
      writer => writer write "hello from Scala"
    }
  }
}
