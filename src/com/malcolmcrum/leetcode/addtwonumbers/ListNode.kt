package com.malcolmcrum.leetcode.addtwonumbers

data class ListNode(var `val`: Int = 0) {
    init {
        assert(`val` in (0..10))
    }
    var next: ListNode? = null
}