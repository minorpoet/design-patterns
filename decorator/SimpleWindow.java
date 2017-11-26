package designpattern.decorator;

/**
 *  Window implementation
 *
 *  Concrete implementation
 *
 */
public class SimpleWindow implements Window {

    @Override
    public void renderWindow() {
       System.out.println(" render simple window");
    }
}
