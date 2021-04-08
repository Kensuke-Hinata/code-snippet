package scala.redocpot.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

object LineCount {
  def main(args : Array[String]) : Unit = {
    val conf = new SparkConf().setAppName("LineCount").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val textFile = sc.textFile("/Users/me/Code/spark-learning/learning-spark-lightning-fast-big-data-analysis/pom.xml")
    println(textFile.count)
    println(textFile.first)
    sc.stop
  }
}
