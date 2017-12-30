package pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite object supporting creation of more complex shapes
 *  Complex Shape
 */
public class ComplexShape implements Shape {

	
	/**
	 * List of shapes 
	 */
	List shapeList = new ArrayList();

	/**
	 * 
	 */
	public void addToShape(Shape shapeToAddToCurrentShape) {

		shapeList.add(shapeToAddToCurrentShape);
		
	}

	
	public Shape[] explodeShape() {

		return (Shape[]) shapeList.toArray();
	}

	/**
	 * this method is implemented directly in basic shapes 
	 * in complex shapes this method is handled with delegation
	 */
	public void renderShapeToScreen() {

		for(Shape s: shapeList){
			
			// use delegation to handle this method
			s.renderShapeToScreen();
			
		}	
	}	
}