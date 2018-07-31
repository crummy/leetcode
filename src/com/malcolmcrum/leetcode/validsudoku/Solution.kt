package com.malcolmcrum.leetcode.validsudoku

class Solution {
	fun isValidSudoku(board: Array<CharArray>): Boolean {
		val sudoku = Sudoku(board)
		return sudoku.filledCells.none { cell ->
			 sudoku.column(cell).any { cell.number == it.number } ||
					sudoku.row(cell).any { cell.number == it.number } ||
					sudoku.square(cell).any { cell.number == it.number }
		}
	}

}

class Sudoku(board: Array<CharArray>) {
	val filledCells: List<FilledCell>
	init {
		val cells: MutableList<FilledCell> = ArrayList()
		board.forEachIndexed { row, chars ->
			chars.forEachIndexed { column, char ->
				if (char != '.') {
					cells.add(FilledCell(char, column, row))
				}
			}
		}
		filledCells = cells
	}

	fun column(cell: FilledCell): List<FilledCell> {
		return filledCells.filter { it.column == cell.column }.filter { it != cell }
	}

	fun row(cell: FilledCell): List<FilledCell> {
		return filledCells.filter { it.row == cell.row }.filter { it != cell }
	}

	fun square(cell: FilledCell): List<FilledCell> {
		return filledCells.filter { it.square == cell.square }.filter { it != cell }
	}
}

class FilledCell(val number: Char, val column: Int, val row: Int) {
	val square = Pair(column/3, row/3)
}