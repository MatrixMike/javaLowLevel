/* Queens.java - Solves the Eight Queens problem for arbitrarily-sized boards

Copyright (C) 2012 Michael Billington <michael.billington@gmail.com>

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
of the Software, and to permit persons to whom the Software is furnished to do
so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/
public class Queens {
	static int solutions = 0;

	public static void main(String[] args) { 
		/* First determine board size */
		int board_size = 8;

		if (args.length > 0) {
		    try {
			board_size = Integer.parseInt(args[0]);
		    } catch (NumberFormatException e) {
			System.err.println("Could not understand board size. Using 8.\n");
		    }
		}

		/* Create blank board */
		int y, x;
		int[][] box = new int[board_size][board_size];
		/* Initialise a totally blank board */
		for(y = 0; y < board_size; y++) {
			for(x = 0; x < board_size; x++) {
				box[x][y] = 0;
			}
		}

		/* Attempt placement of queens in each place on the left column. */
		for(y = 0; y < board_size; y++) {
			/* plotQueen() is recursive */
			plotQueen(board_size, box, 0, y);
		}

		System.err.println("Found " + solutions + " solutions");
	}

	static void registerSolution(Board board) {
		/* Called when a solution is found */
		board.printText();
		solutions++;
	}

	static boolean plotQueen(int size, int[][] data, int queen_x, int queen_y) {
		/* Place a queen in the designated place, if possible */
		int x, y;
		Board board = new Board(size, data);

		if(board.box[queen_x][queen_y] != 0) {
		/* If square contains a queen already or is 'deadly', this path
			is useless */
			return false;
		}

		/* Mark out all new 'deadly' squares caused by this queen */
		for(y = 0; y < board.height; y++) {
			/* Vertical line */
			board.box[queen_x][y] = 1;
		}
		for(x = 0; x < board.width; x++) {
			/* Horizontal */
			if(board.box[x][queen_y] == 2) {
				/* Stop if we kill another queen from across */
				return false;
			} else {
				board.box[x][queen_y] = 1;
			}
		}
		int i = 1;
		for(i = 1; i <= board.height; i++) {
			/* Extend diagonally in 4 directions up to n blocks */
			/* (for each iteration, at least one of these will change a value) */
			board.safePlot(queen_x+i, queen_y+i, 1);
			board.safePlot(queen_x-i, queen_y-i, 1);
			board.safePlot(queen_x+i, queen_y-i, 1);
			board.safePlot(queen_x-i, queen_y+i, 1);
		}

		/* Actual location of queen */
		board.box[queen_x][queen_y] = 2;
		if(queen_x + 1 == size) {
			/* We have reached the end of the board */
			registerSolution(board);
		} else {
			/* Recurse, solving valid queen positions for next column */
			for(y = 0; y < board.height; y++) {
				plotQueen(size, board.box, queen_x+1, y);
			}
		}
		return true;
	}
}

class Board {
	int width = 0;
	int height = 0;
	int[][] box;

	Board(int n, int[][] data) {
		width = n;
		height = n;
		/* Initialise all squares as blank */
		box = new int[n][n];
		int x;
		int y;
		for(y = 0; y < n; y++) {
			for(x = 0; x < n; x++) {
				box[x][y] = data[x][y];
			}
		}
	}

	void safePlot(int x, int y, int val) {
		/* Plot with bounds-checking */
		if(x >= 0 && x < width) {
			if(y >= 0 && y < height) {
				box[x][y] = val;
			}
		}
	}

	public void printText() {
		/* Print a board as text */
		int x, y;
		for(y = 0; y < height; y++) {
			for(x = 0; x < width; x++) {
				switch(box[x][y]) {
					case 2:
						System.out.print("Q");
						break;
					case 1:
						System.out.print("-");
						break;
					default:
						System.out.print(" ");
						break;
				}
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
