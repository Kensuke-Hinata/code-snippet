# coding: utf-8

import findspark
findspark.init()

import pyspark

from pyspark import SparkContext
from pyspark import SparkConf

conf = SparkConf().setAppName('PassFunction').setMaster('local[*]')
sc = SparkContext.getOrCreate(conf)

lines = sc.textFile("/Users/me/Code/spark-learning/learning-spark-lightning-fast-big-data-analysis/pom.xml")

def has_str(s):
    def func(line):
        return s in line
    return func

xml_lines = lines.filter(has_str('xml'))
print xml_lines.first()
