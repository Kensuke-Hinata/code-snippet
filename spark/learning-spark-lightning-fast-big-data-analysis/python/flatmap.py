# coding: utf-8

import findspark
findspark.init()

import pyspark

from pyspark import SparkContext
from pyspark import SparkConf

conf = SparkConf().setAppName('FlatMap').setMaster('local[*]')
sc = SparkContext.getOrCreate(conf)

lines = sc.parallelize(['hello world', 'hi'])
words = lines.flatMap(lambda line: line.split(' '))
print words.collect()
