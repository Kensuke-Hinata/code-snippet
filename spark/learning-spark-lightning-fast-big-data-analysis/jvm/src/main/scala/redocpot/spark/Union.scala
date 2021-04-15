package scala.redocpot.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

object Union {
  def main(args : Array[String]) : Unit = {
    val conf = new SparkConf().setAppName("Union").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val textFile = sc.textFile("/Users/me/Code/spark-learning/learning-spark-lightning-fast-big-data-analysis/pom.xml")
    val xmlLines = textFile.filter(line => line.contains("xml"))
    val mavenLines = textFile.filter(line => line.contains("maven"))
    val unionLines = xmlLines.union(mavenLines)
    unionLines.foreach(line => {
      println(line)
    })
    sc.stop
  }
}
