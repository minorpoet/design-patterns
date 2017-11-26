package designpattern.decorator;

public class GUIDriver {
    public static void main(String[] args) {
        Window window = new SimpleWindow();

        window.renderWindow();

        System.out.println("decorate window with srollbar--------------");
        window = new ScrollableWindow(window);

        window.renderWindow();
    }
}
