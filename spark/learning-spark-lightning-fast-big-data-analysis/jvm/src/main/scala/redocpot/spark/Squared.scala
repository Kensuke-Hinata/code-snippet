package scala.redocpot.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

object Squared {
  def main(args : Array[String]) : Unit = {
    val conf = new SparkConf().setAppName("Squared").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val input = sc.parallelize(List(1, 2, 3, 4))
    val result = input.map(x => x * x)
    println(result.collect().mkString(","))
    sc.stop
  }
}
