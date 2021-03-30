# coding: utf-8

import findspark
findspark.init()

import pyspark

from pyspark import SparkContext
from pyspark import SparkConf

conf = SparkConf().setAppName('Reduce').setMaster('local[*]')
sc = SparkContext.getOrCreate(conf)

nums = sc.parallelize([1, 2, 3, 4])
sum = nums.reduce(lambda x, y: x + y)
print sum
