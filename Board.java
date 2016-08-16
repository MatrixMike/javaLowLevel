/*
 * Board.java
 * 
 * Mods made in 2016 by mike <mike@electroteach.com>
 * Copyright (C) 2012 Michael Billington <michael.billington@gmail.com>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */

/**
 * Utilities for Queens support
 * @author michael.billington@gmail.com
 * @version 1.1 
 */
public class Board {
	int width = 0;
	int height = 0;
	int[][] box;
/**
 * Initialise all squares as blank
 * @param n could be size of board
 * @param data source? to put in box
 */
public Board(int n, int[][] data) {
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
/**
 * safePlot
 * @param x co-ordinate of Queen
 * @param y co-ordinate of Queen
 * @param val value to be assigned at that co-ordinate
 */
public void safePlot(int x, int y, int val) {
		/* Plot with bounds-checking */
		if(x >= 0 && x < width) {
			if(y >= 0 && y < height) {
				box[x][y] = val;
			}
		}
	}
/**
 * printText()
 * 
 */
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
