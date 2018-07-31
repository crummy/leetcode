package com.malcolmcrum.leetcode.validsudoku

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class SolutionTest {
	@Test
	fun `sample test`() {
		val board = arrayOf(
			charArrayOf('5','3','.','.','7','.','.','.','.'),
			charArrayOf('6','.','.','1','9','5','.','.','.'),
			charArrayOf('.','9','8','.','.','.','.','6','.'),
			charArrayOf('8','.','.','.','6','.','.','.','3'),
			charArrayOf('4','.','.','8','.','3','.','.','1'),
			charArrayOf('7','.','.','.','2','.','.','.','6'),
			charArrayOf('.','6','.','.','.','.','2','8','.'),
			charArrayOf('.','.','.','4','1','9','.','.','5'),
			charArrayOf('.','.','.','.','8','.','.','7','9')
		)
		val answer = Solution().isValidSudoku(board)
		assertTrue(answer)
	}

	@Test
	fun `square failure`() {
		val board = arrayOf(
				charArrayOf('5','3','.','.','7','.','.','.','.'),
				charArrayOf('6','.','3','1','9','5','.','.','.'),
				charArrayOf('.','9','8','.','.','.','.','6','.'),
				charArrayOf('8','.','.','.','6','.','.','.','3'),
				charArrayOf('4','.','.','8','.','3','.','.','1'),
				charArrayOf('7','.','.','.','2','.','.','.','6'),
				charArrayOf('.','6','.','.','.','.','2','8','.'),
				charArrayOf('.','.','.','4','1','9','.','.','5'),
				charArrayOf('.','.','.','.','8','.','.','7','9')
		)
		val answer = Solution().isValidSudoku(board)
		assertFalse(answer)
	}

	@Test
	fun `row failure`() {
		val board = arrayOf(
				charArrayOf('5','3','.','3','7','.','.','.','.'),
				charArrayOf('6','.','3','1','9','5','.','.','.'),
				charArrayOf('.','9','8','.','.','.','.','6','.'),
				charArrayOf('8','.','.','.','6','.','.','.','3'),
				charArrayOf('4','.','.','8','.','3','.','.','1'),
				charArrayOf('7','.','.','.','2','.','.','.','6'),
				charArrayOf('.','6','.','.','.','.','2','8','.'),
				charArrayOf('.','.','.','4','1','9','.','.','5'),
				charArrayOf('.','.','.','.','8','.','.','7','9')
		)
		val answer = Solution().isValidSudoku(board)
		assertFalse(answer)
	}

	@Test
	fun `col failure`() {
		val board = arrayOf(
				charArrayOf('5','3','.','3','7','.','.','.','.'),
				charArrayOf('6','.','3','1','9','5','.','.','.'),
				charArrayOf('.','9','8','.','.','.','.','6','.'),
				charArrayOf('8','.','.','.','6','.','.','.','3'),
				charArrayOf('4','.','.','8','.','3','.','.','1'),
				charArrayOf('7','.','.','.','2','.','.','.','6'),
				charArrayOf('.','6','.','.','.','.','2','8','.'),
				charArrayOf('.','.','.','4','1','9','.','.','5'),
				charArrayOf('.','.','3','.','8','.','.','7','9')
		)
		val answer = Solution().isValidSudoku(board)
		assertFalse(answer)
	}
}