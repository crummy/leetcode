package com.malcolmcrum.leetcode

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        return TwoSum(nums.toList(), target)
                .find(0, 0)
                .toIntArray()
    }
}

class TwoSum(private val nums: List<Int>, private val target: Int) {
    fun find(index: Int, total: Int): List<Int> {
        if (total == target) {
            return listOf()
        } else if (index >= nums.size) {
            throw NoPathFoundException()
        } else if (total > target) {
            throw OutOfRangeException()
        } else {
            for (next in ((index+1)..nums.size)) {
                try {
                    val newTotal = total + nums[index]
                    return mutableListOf(index).plus(find(next, newTotal))
                } catch (e: OutOfRangeException) {
                    return find(next, total)
                } catch (e: NoPathFoundException) {
                    return listOf()
                }
            }
            throw Exception("no answer found")
        }
    }
}

class OutOfRangeException : Exception()
class NoPathFoundException : Exception()

data class Num(val num: Int, val index: Int)