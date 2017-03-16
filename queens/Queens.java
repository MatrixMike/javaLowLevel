/* Queens.java - Solves the Eight Queens problem for arbitrarily-sized boards

Copyright (C) 2012 Michael Billington <michael.billington@gmail.com>
* Modifications made by Mike Hewitt on, or around, 17.08.2016 
* as an exercise in documentation and refactoring and understanding other people's code.
* using github to save stages in the change
* some refactoring taking place to remove redundant code and attempto improve efficiency.
* javadoc used to present documentation 

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
package queens;		// fix error caused when this uncommented
/**
 * generate solution to 8 Queens problem
 * @author michael.billington@gmail.com
 * @version 1.2
 */
public class Queens {
	static int solutions = 0;
/**
 * Solves the Eight Queens problem for arbitrarily-sized boards
 * @param args Input from command line
 */
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
/**
 * generate display output when solution found
 * @param board A board to print
 */
public static void registerSolution(Board board) {
		/* Called when a solution is found */
		board.printText();
		solutions++;
	}
/**
 * Place a queen in the designated place, if possible. RECURSIVE
 * @param size board size?
 * @param data space for a new board ??
 * @param queen_x co-ordinate of Q
 * @param queen_y co-ordinate of Q
 * @return questionable whether this is used / needed
 */
public static boolean plotQueen(int size, int[][] data, int queen_x, int queen_y) {
		/* Place a queen in the designated place, if possible */
		Board board = new Board(size, data);

		if(board.box[queen_x][queen_y] != 0) {
		/* If square contains a queen already or is 'deadly', this path
			is useless */
			return false;
		}

		/* Mark out all new 'deadly' squares caused by this queen */
		for(int y = 0; y < board.height; y++) {
			/* Vertical line */
			board.box[queen_x][y] = 1;
		}
		for(int x = 0; x < board.width; x++) {
			/* Horizontal */
			if(board.box[x][queen_y] == 2) {
				/* Stop if we kill another queen from across */
				return false;
			} else {
				board.box[x][queen_y] = 1;
			}
		}
		for(int i = 1; i <= board.height; i++) {
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
			for(int y = 0; y < board.height; y++) {
				plotQueen(size, board.box, queen_x+1, y);
			}
		}
		return true;
	}
}

