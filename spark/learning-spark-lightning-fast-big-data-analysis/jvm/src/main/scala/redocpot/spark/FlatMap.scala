package scala.redocpot.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

object FlatMap {
  def main(args : Array[String]) : Unit = {
    val conf = new SparkConf().setAppName("FlatMap").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val lines = sc.parallelize(List("hello world", "hi"))
    val words = lines.flatMap(line => line.split(" "))
    println(words.collect)
    sc.stop
  }
}
