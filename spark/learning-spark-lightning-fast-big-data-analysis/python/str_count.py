# coding: utf-8

import findspark
findspark.init()

import pyspark

from pyspark import SparkContext
from pyspark import SparkConf

conf = SparkConf().setAppName('StrCount').setMaster('local[*]')
sc = SparkContext.getOrCreate(conf)

lines = sc.textFile("/Users/me/Code/spark-learning/learning-spark-lightning-fast-big-data-analysis/pom.xml")
xml_rdd = lines.filter(lambda line: 'xml' in line)
print 'Input had ' + str(xml_rdd.count()) + ' concerning lines'
print 'Here are some examples:'
for line in xml_rdd.take(10):
    print line
