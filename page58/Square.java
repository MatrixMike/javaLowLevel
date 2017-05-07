package com.electroteach.shapes;

import java.awt.*;
public class Square extends Shape {
	public Square(int x, int y) {
		loc = new Point(x,y);
	}
	public void draw(Graphics g) {
		g.drawRect(loc.x, loc.y, 20,20);
	}
}
