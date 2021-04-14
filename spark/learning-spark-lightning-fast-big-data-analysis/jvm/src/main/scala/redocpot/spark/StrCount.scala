package scala.redocpot.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

object StrCount {
  def hasStr(s : String)(line : String) : Boolean = {
    line.contains(s)
  }

  def main(args : Array[String]) : Unit = {
    val conf = new SparkConf().setAppName("StrCount").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val textFile = sc.textFile("/Users/me/Code/spark-learning/learning-spark-lightning-fast-big-data-analysis/pom.xml")
    //val xmlLines = textFile.filter(line => line.contains("xml"))
    val xmlLines = textFile.filter(hasStr("xml"))
    println("Input had " + xmlLines.count() + " concerning lines")
    println("Here are some examples:")
    xmlLines.take(10).foreach(println)
    sc.stop
  }
}
