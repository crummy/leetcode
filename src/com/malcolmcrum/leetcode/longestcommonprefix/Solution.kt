package com.malcolmcrum.leetcode.longestcommonprefix

class Solution {
	fun longestCommonPrefix(strs: Array<String>): String {
		var answer = ""
		val maxLength = strs.minBy { it.length }?.length ?: 0
		(0 until maxLength).forEach { index ->
			val nextChar = strs[0][index]
			if (strs.all { it[index] == nextChar }) {
				answer += nextChar
			} else {
				return answer
			}
		}
		return answer
	}
}