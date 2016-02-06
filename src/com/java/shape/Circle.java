package com.java.shape;

public class Circle extends Shape {
	int radius;
	Circle(int radius,DrawAPI draw){
		super(draw);
		this.radius=radius;
	}
	
	@Override
	public void draw() {
		draw.drawShape(radius);
	}
}