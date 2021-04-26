package redocpot.spark;

import java.util.Arrays;
import java.util.Iterator;

import scala.Tuple2;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.PairFunction;

public class WordCount {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf()
            .setMaster("local")
            .setAppName("WordCount");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> textFile = sc.textFile(
                "/Users/me/Code/spark-learning/learning-spark-lightning-fast-big-data-analysis/pom.xml");
        JavaRDD<String> words = textFile.flatMap(
                new FlatMapFunction<String, String>() {
                    @Override
                    public Iterator<String> call(String s) {
                        return Arrays.asList(s.split(" ")).iterator();
                    }
                }
                );
        JavaPairRDD<String, Integer> counts = words.mapToPair(new PairFunction<String, String, Integer>() {
            public Tuple2<String, Integer> call(String s) {
                return new Tuple2(s, 1);
            }
        }
        ).reduceByKey(new Function2<Integer, Integer, Integer>() {
            public Integer call(Integer x, Integer y) {
                return x + y;
            }
        });
        counts.foreach(line -> {
            System.out.println(line);
        });

        sc.stop();
    }
}
