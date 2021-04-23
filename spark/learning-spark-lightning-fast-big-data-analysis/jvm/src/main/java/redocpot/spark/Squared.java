package redocpot.spark;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;

public class Squared {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf()
            .setMaster("local")
            .setAppName("Squared");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<Integer> rdd = sc.parallelize(Arrays.asList(1, 2, 3, 4));
        JavaRDD<Integer> result = rdd.map(new Function<Integer, Integer>() {
            public Integer call(Integer x) {
                return x * x;
            }
        });
        System.out.println(StringUtils.join(result.collect(), ","));

        sc.stop();
    }
}
