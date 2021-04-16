package scala.redocpot.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

object WordCount {
  def main(args : Array[String]) : Unit = {
    val conf = new SparkConf().setAppName("WordCount").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val textFile = sc.textFile("/Users/me/Code/spark-learning/learning-spark-lightning-fast-big-data-analysis/pom.xml")
    val wordCount = textFile.flatMap(
      line => line.split(" ")
    ).map(
      word => (word, 1)
    ).reduceByKey((a, b) => a + b)
    wordCount.collect().foreach(elem => {
      val (key, value) = elem
      println(key + " = " + value)
    })
    sc.stop
  }
}
