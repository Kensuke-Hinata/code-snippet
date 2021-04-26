package redocpot.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class Union {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf()
            .setMaster("local")
            .setAppName("Union");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> textFile = sc.textFile(
                "/Users/me/Code/spark-learning/learning-spark-lightning-fast-big-data-analysis/pom.xml");
        JavaRDD<String> xmlLines = textFile.filter(line -> line.contains("xml"));
        JavaRDD<String> mavenLines = textFile.filter(line -> line.contains("maven"));
        JavaRDD<String> unionLines = xmlLines.union(mavenLines);
        unionLines.foreach(line -> {
            System.out.println(line);
        });

        sc.stop();
    }
}
