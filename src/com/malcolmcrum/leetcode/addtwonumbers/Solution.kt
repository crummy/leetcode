package com.malcolmcrum.leetcode.addtwonumbers

class Solution {
	fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
		return when {
			l1 == null -> l2
			l2 == null -> l1
			else ->  {
				val result = l1.toLong() + l2.toLong()
				result.toListNode()
			}
		}
	}
}

data class ListNode(var `val`: Int = 0) {
	init {
		assert(`val` in (0..10))
	}
	var next: ListNode? = null


}

fun ListNode.toLong(): Long {
	return ((next?.toLong() ?: "").toString() + `val`).toLong()
}

fun Long.toListNode(): ListNode? {
	var lastNode: ListNode? = null
	this.toString().toList().forEach {
		val newNode = ListNode(Character.getNumericValue(it))
		newNode.next = lastNode
		lastNode = newNode
	}
	return lastNode
}