package redocpot.spark;

import java.util.Arrays;
import java.io.Serializable;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function2;

public class Aggregate implements Serializable {
    public int total;
    public int num;

    public Aggregate(int total, int num) {
        this.total = total;
        this.num = num;
    }

    public double average() {
        return total / (double)num;
    }

    public static void main(String[] args) {
        SparkConf conf = new SparkConf()
            .setMaster("local")
            .setAppName("Aggregate");
        JavaSparkContext sc = new JavaSparkContext(conf);

        Function2<Aggregate, Integer, Aggregate> addAndCount =
            new Function2<Aggregate, Integer, Aggregate>() {
                public Aggregate call(Aggregate a, Integer x) {
                    a.total += x;
                    ++ a.num;
                    return a;
                }
            };
        Function2<Aggregate, Aggregate, Aggregate> combine =
            new Function2<Aggregate, Aggregate, Aggregate>() {
                public Aggregate call(Aggregate a, Aggregate b) {
                    a.total += b.total;
                    a.num += b.num;
                    return a;
                }
            };
        JavaRDD<Integer> rdd = sc.parallelize(Arrays.asList(1, 2, 3, 4));
        Aggregate initial = new Aggregate(0, 0);
        Aggregate result = rdd.aggregate(initial, addAndCount, combine);
        System.out.println(result.average());

        sc.stop();
    }
}
