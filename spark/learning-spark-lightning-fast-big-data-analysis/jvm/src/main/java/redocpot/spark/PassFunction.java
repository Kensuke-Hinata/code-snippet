package redocpot.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;

public class PassFunction {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf()
            .setMaster("local")
            .setAppName("PassFunction");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> textFile = sc.textFile(
                "/Users/me/Code/spark-learning/learning-spark-lightning-fast-big-data-analysis/pom.xml");
        JavaRDD<String> xmlLines = textFile.filter(
                new Function<String, Boolean>() {
                    public Boolean call(String s) {
                        return s.contains("xml");
                    }
                }
                );
        xmlLines.foreach(line -> {
            System.out.println(line);
        });

        sc.stop();
    }
}
