package com.malcolmcrum.leetcode

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        return TwoSum(nums.toList())
                .find(0, target)
                .toIntArray()
    }
}

class TwoSum(private val nums: List<Int>) {
    fun find(index: Int, remainingTotal: Int): List<Int> {
		print(" ".repeat(index))
		when {
			remainingTotal == 0 -> {
				println("Found solution!")
				return listOf()
			}
			index >= nums.size -> {
				println("Ran out of elements, went down the wrong path")
				throw WrongPathException()
			}
			remainingTotal < 0 -> {
				println("Remaining total is $remainingTotal; wrong path")
				throw WrongPathException()
			}
			else -> {
				(index until nums.size).forEach {
					try {
						println("Checking $index(${nums[index]}) in $nums, remainingTotal: $remainingTotal")
						return listOf(index).plus(find(it + 1, remainingTotal - nums[index]))
					} catch (e: WrongPathException) {
						println("Skipping $index(${nums[index]}) in $nums, remainingTotal: $remainingTotal")
						return find(it + 1, remainingTotal)
					} catch (e: NoPathsFoundException) {
						println("Skip $index")
					}
				}
			}
		}
		throw NoPathsFoundException() // should never happen...
	}
}

class NoPathsFoundException : Exception()
class WrongPathException : Exception()

data class Num(val num: Int, val index: Int)