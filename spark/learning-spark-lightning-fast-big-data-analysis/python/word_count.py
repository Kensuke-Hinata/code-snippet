# coding: utf-8

import findspark
findspark.init()

import pyspark

from pyspark import SparkContext
from pyspark import SparkConf

conf = SparkConf().setAppName('WordCount').setMaster('local[*]')
sc = SparkContext.getOrCreate(conf)

lines = sc.textFile("/Users/me/Code/spark-learning/learning-spark-lightning-fast-big-data-analysis/pom.xml")
word_count = lines.flatMap(lambda line: line.split(' ')).map(
    lambda word: (word, 1)
).reduceByKey(lambda x, y: x + y)

for e in word_count.collect():
    (k, v) = e
    print k, " = ", v
