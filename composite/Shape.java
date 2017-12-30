package pattern.composite;

public interface Shape{

    void renderShapeToScreen();

    Shape[] exploedShape();

    void addToShape(Shape shape);
}