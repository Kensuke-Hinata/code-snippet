package redocpot.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class StrCount {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf()
            .setMaster("local")
            .setAppName("StrCount");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> textFile = sc.textFile(
                "/Users/me/Code/spark-learning/learning-spark-lightning-fast-big-data-analysis/pom.xml");
        JavaRDD<String> xmlLines = textFile.filter(line -> line.contains("xml"));
        System.out.println("Input had " + xmlLines.count() + " concerning lines");
        System.out.println("Here are some examples:");
        for (String line: xmlLines.take(10)) {
            System.out.println(line);
        }

        sc.stop();
    }
}
