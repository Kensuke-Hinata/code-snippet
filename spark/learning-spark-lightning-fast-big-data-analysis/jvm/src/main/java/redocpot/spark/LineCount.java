package redocpot.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class LineCount {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf()
            .setMaster("local")
            .setAppName("LineCount");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> textFile = sc.textFile(
                "/Users/me/Code/spark-learning/learning-spark-lightning-fast-big-data-analysis/pom.xml");
        System.out.println(textFile.count());
        System.out.println(textFile.first());

        sc.stop();
    }
}
