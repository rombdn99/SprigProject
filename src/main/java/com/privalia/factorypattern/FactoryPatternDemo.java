package com.privalia.factorypattern;


public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory= new ShapeFactory();
		Shape shape1= shapeFactory.getShape(com.privalia.factorypattern.Circle.class);
		shape1.draw();
		Shape shape2= shapeFactory.getShape(com.privalia.factorypattern.Square.class);
		shape2.draw();
		Shape shape3= shapeFactory.getShape(com.privalia.factorypattern.Rectangle.class);
		shape3.draw();
	}

}
