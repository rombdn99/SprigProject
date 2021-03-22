package com.privalia.factorypattern;

public class ShapeFactory {
	public Shape getShape(Class<?> class1) {
		if(class1==null) {
			return null;
		}
		if(createObject(class1) instanceof Shape){
			Shape r=(Shape) createObject(class1);
			return r;
		}
		return null;
	}
	static Object createObject(Class<?> className){
		Object object = null;
		try{
			object = className.newInstance();
		} catch(InstantiationException e){
			System.out.println(e);
		} catch(IllegalAccessException e){
			System.out.println(e);
		} 
		return object;
	}
}
