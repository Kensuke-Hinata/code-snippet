# coding: utf-8

import findspark
findspark.init()

import pyspark

from pyspark import SparkContext
from pyspark import SparkConf

conf = SparkConf().setAppName('LineCount').setMaster('local[*]')
sc = SparkContext.getOrCreate(conf)

lines = sc.textFile("/Users/me/Code/spark-learning/learning-spark-lightning-fast-big-data-analysis/pom.xml")
print lines.count()
print lines.first()
