# coding: utf-8

import findspark
findspark.init()

import pyspark

from pyspark import SparkContext
from pyspark import SparkConf

conf = SparkConf().setAppName('Union').setMaster('local[*]')
sc = SparkContext.getOrCreate(conf)

lines = sc.textFile("/Users/me/Code/spark-learning/learning-spark-lightning-fast-big-data-analysis/pom.xml")
xml_rdd = lines.filter(lambda line: 'xml' in line)
maven_rdd = lines.filter(lambda line: 'maven' in line)
union_rdd = xml_rdd.union(maven_rdd)

for line in union_rdd.collect():
    print line
