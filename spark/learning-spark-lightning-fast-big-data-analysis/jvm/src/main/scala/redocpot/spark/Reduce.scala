package scala.redocpot.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

object Reduce {
  def main(args : Array[String]) : Unit = {
    val conf = new SparkConf().setAppName("Reduce").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val input = sc.parallelize(List(1, 2, 3, 4))
    val sum = input.reduce((x, y) => x + y)
    println(sum)
    sc.stop
  }
}
