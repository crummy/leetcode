package com.malcolmcrum.leetcode.reverseinteger

class Solution {
    fun reverse(x: Int): Int {
        val negative = x < 0
        val reversedDigits = x.toString().removePrefix("-").reversed()
        return try {
            if (negative) "-$reversedDigits".toInt() else reversedDigits.toInt()
        } catch (e: NumberFormatException) {
            0
        }
    }
}