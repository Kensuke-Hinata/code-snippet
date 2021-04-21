package redocpot.spark;

import scala.Tuple2;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.PairFunction;

public class Pair {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf()
            .setMaster("local")
            .setAppName("PassFunction");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> textFile = sc.textFile(
                "/Users/me/Code/spark-learning/learning-spark-lightning-fast-big-data-analysis/jvm/pom.xml");

        PairFunction<String, String, String> keyData =
            new PairFunction<String, String, String>() {
                public Tuple2<String, String> call(String s) {
                    return new Tuple2(s.split(" ")[0], s);
                } 
            };
        JavaPairRDD<String, String> pairs = textFile.mapToPair(keyData);

        sc.stop();
    }
}
