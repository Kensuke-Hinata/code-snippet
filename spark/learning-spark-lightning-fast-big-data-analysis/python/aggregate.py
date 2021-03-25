# coding: utf-8

import findspark
findspark.init()

import pyspark

from pyspark import SparkContext
from pyspark import SparkConf

conf = SparkConf().setAppName('FlatMap').setMaster('local[*]')
sc = SparkContext.getOrCreate(conf)

nums = sc.parallelize([1, 2, 3, 4])
sum_count = nums.aggregate((0, 0),
                           (lambda acc, value: (acc[0] + value, acc[1] + 1)),
                           (lambda acc0, acc1: (acc0[0] + acc1[0], acc0[1] + acc1[1])))
print sum_count[0] / float(sum_count[1])
