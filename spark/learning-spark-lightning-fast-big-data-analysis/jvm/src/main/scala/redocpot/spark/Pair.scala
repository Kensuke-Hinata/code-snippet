package scala.redocpot.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

object Pair {
  def main(args : Array[String]) : Unit = {
    val conf = new SparkConf().setAppName("Aggregate").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val textFile = sc.textFile(
      "/Users/me/Code/spark-learning/learning-spark-lightning-fast-big-data-analysis/jvm/pom.xml")
    val pairs = textFile.map(x => (x.split(" ")(0), x))
    println(pairs.first)
    sc.stop
  }
}
