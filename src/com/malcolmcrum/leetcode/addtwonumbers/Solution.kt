package com.malcolmcrum.leetcode.addtwonumbers

import java.math.BigDecimal

class Solution {
	fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
		return when {
			l1 == null -> l2
			l2 == null -> l1
			else ->  {
				val result = BigDecimal(l1.stringify()) + BigDecimal(l2.stringify())
				return result.toListNode()
			}
		}
	}
}

fun ListNode.stringify(): String {
	return (next?.stringify() ?: "") + `val`
}

fun BigDecimal.toListNode(): ListNode? {
	var lastNode: ListNode? = null
	this.toString().toList().forEach {
		val newNode = ListNode(Character.getNumericValue(it))
		newNode.next = lastNode
		lastNode = newNode
	}
	return lastNode
}