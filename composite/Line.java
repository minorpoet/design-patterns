package pattern.composite;
 

public class Line implements Shape{

    public Line(int pointX, int pointY, int point2X, int point2Y){

    }

    public void renderShapeToScreen(){
        System.out.println("rendering line ");
    }

    public Shape[] exploedShape(){
        
    }

    public void addToShape(Shape shape){
        throw new RuntimeException("cannot add a shape to simpe shapes...");
    }
}