package com.malcolmcrum.leetcode.addtwonumbers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class AddTwoNumbersTest {
	@Test
	fun `test empty lists`() {
		val answer = Solution().addTwoNumbers(null, null)
		assertEquals(null, answer)
	}

	@Test
	fun sample() {
		val answer = Solution().addTwoNumbers(342.toListNode(), 465.toListNode())
		assertEquals(807.toListNode(), answer)
	}

	@Test
	fun `int to ListNode`() {
		val two = ListNode(2)
		val four = ListNode(4)
		val three = ListNode(3)
		two.next = four
		four.next = three
		assertEquals(342.toListNode(), two)
	}
}

fun Int.toListNode(): ListNode? {
	var lastNode: ListNode? = null
	this.toString().toList().forEach {
		val newNode = com.malcolmcrum.leetcode.addtwonumbers.ListNode(Character.getNumericValue(it))
		newNode.next = lastNode
		lastNode = newNode
	}
	return lastNode
}