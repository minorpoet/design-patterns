package pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 图形编辑器
 */
public class GraphicsEditor {

	public static void main(String[] args) {
		
		List allShapesInSoftware = new ArrayList();
		// 创建直线
		Shape lineShape = new Line(0,0,1,1);
		allShapesInSoftware.add(lineShape);
		
		// 创建矩形
		Shape rectangelShape = new Rectangle();
		allShapesInSoftware.add(rectangelShape);
	
		ComplexShape complexShape = new ComplexShape(); 
		complexShape.addToShape(rectangelShape);
        complexShape.addToShape(lineShape); 
        
        // 将复合图形加入数组中
		allShapesInSoftware.add(complexShape);
		
        // 创建一个更复杂的图形，由复杂图形和简单直线图形组成
		ComplexShape veryComplexShape = new  ComplexShape();
		veryComplexShape.addToShape(complexShape);
		veryComplexShape.addToShape(lineShape);
	
		allShapesInSoftware.add(veryComplexShape);
		renderGraphics(allShapesInSoftware);
	 
		Shape[] arrayOfShapes = allShapesInSoftware.get(0).explodeShape();
	}
	
	private static void renderGraphics(List shapesToRender){

        /**
         * 尽管数组中的图形包括简单图形和复杂图形，我们都能通过Shape接口直接操作
         */
		for(Shape s : shapesToRender){
			s.renderShapeToScreen();
		}
		
	}	
}