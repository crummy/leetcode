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
		when {
			remainingTotal == 0 -> {
				log(index, "Found solution!")
				return listOf()
			}
			index >= nums.size -> {
				log(index, "Ran out of elements, went down the wrong path")
				throw WrongPathException()
			}
			remainingTotal < 0 -> {
				log(index, "Remaining total is $remainingTotal; wrong path")
				throw WrongPathException()
			}
			else -> {
				(index until nums.size).forEach {
					return try {
						log(index,"Checking $index(${nums[index]}) in $nums, remainingTotal: $remainingTotal")
						listOf(index).plus(find(it + 1, remainingTotal - nums[index]))
					} catch (e: WrongPathException) {
						log(index, "Skipping $index(${nums[index]}) in $nums, remainingTotal: $remainingTotal")
						find(it + 1, remainingTotal)
					}
				}
			}
		}
		throw NoPathsFoundException() // should never happen...
	}

	private fun log(index: Int, message: String) {
		print(" ".repeat(index))
		println(message)
	}
}

class NoPathsFoundException : Exception()
class WrongPathException : Exception()