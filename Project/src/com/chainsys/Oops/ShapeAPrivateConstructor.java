package com.chainsys.Oops;

public class ShapeAPrivateConstructor {

	public int height;
	public int width;
	
	
	private ShapeAPrivateConstructor() {
		System.out.println("ShapeA CreatedA " + hashCode());
	}
	private ShapeAPrivateConstructor(int x){
		height = x;
		width = x;
		System.out.println(x + "ShapeA CreatedB " + hashCode());
	}
	public static ShapeAPrivateConstructor getObject() {
		return new ShapeAPrivateConstructor();
	}
	public static void testPrivateConstructor() {
	    ShapeAPrivateConstructor refShapeA=ShapeAPrivateConstructor.getObject();
		refShapeA.height=123;
		refShapeA.width=500;
		refShapeA.echo();
	}
	public void echo() {
		System.out.println("Echo");
	}
}
