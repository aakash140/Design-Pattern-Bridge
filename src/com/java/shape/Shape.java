package com.java.shape;

public abstract class Shape{
	DrawAPI draw;
	Shape(DrawAPI draw){
		this.draw=draw;
	}
	public abstract void draw();
}