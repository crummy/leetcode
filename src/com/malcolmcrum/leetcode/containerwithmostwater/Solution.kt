package com.malcolmcrum.leetcode.containerwithmostwater

class Solution {
	fun maxArea(height: IntArray): Int {
		var max = height.min() ?: 0
		(0 until height.size).forEach { left ->
			(left + 1 until height.size).forEach { right ->
				if (left != right) {
					val smaller = Math.min(height[left], height[right])
					val distance = right - left
					val area = smaller * distance
					if (area > max) max = area
				}
			}
		}
		return max
	}
}