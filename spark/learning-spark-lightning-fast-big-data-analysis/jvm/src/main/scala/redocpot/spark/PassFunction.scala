package scala.redocpot.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

object PassFunction {
  def hasStr(s : String)(line : String) : Boolean = {
    line.contains(s)
  }

  def main(args : Array[String]) : Unit = {
    val conf = new SparkConf().setAppName("PassFunction").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val textFile = sc.textFile("/Users/me/Code/spark-learning/learning-spark-lightning-fast-big-data-analysis/pom.xml")
    //val xmlLines = textFile.filter(line => line.contains("xml"))
    val xmlLines = textFile.filter(hasStr("xml"))
    println(xmlLines.first)
    sc.stop
  }
}
