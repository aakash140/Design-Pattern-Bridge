package com.java.shape;

public class BridgePatternApp {

	public static void main(String[] args) {
		Shape circle1=new Circle(10,new BlueCircle());
		Shape circle2=new Circle(20,new RedCircle());
		circle1.draw();
		circle2.draw();
	}
}