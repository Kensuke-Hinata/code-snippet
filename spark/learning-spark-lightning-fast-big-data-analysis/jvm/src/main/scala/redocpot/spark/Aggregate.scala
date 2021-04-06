package scala.redocpot.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

object Aggregate {
  def main(args : Array[String]) : Unit = {
    val conf = new SparkConf().setAppName("Aggregate").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val input = sc.parallelize(List(1, 2, 3, 4))
    val result = input.aggregate((0, 0))(
      (acc, value) => (acc._1 + value, acc._2 + 1),
      (acc0, acc1) => (acc0._1 + acc1._1, acc0._2 + acc1._2)
      )
    println(result._1 / result._2.toDouble)
    sc.stop
  }
}
