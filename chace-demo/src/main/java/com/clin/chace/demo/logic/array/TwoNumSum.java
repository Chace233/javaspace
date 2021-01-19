package com.clin.chace.demo.logic.array;

/**
 * 两数之和
 * 问题描述：
 * 对于给定的一个数组，找出两个数之和等于target，找出一组即可。
 * 例如[3,2,5] target=7
 * 输出为[2, 5]
 *
 * 解题思路：
 * 1.Hash表法：
 * 根据数组中每个值，计算出target-array[i]的值，存储hash对应的key中(类似于 Map.put(4, 3))
 * 然后遍历一遍数组，查看数组中的值是否在Map的key中
 */
public class TwoNumSum {
}
