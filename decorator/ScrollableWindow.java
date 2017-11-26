package designpattern.decorator;

/**
 * 带扩展状态的具体装饰者
 */
public class ScrollableWindow extends DecoratedWindow {

    private Object scrollBarObjectRepresentation = null;

    public ScrollableWindow(Window windowReference) {
        super(windowReference);
    }

    @Override
    public void renderWindow() {
        // 在被装饰对象行为至上添加滚动窗口特有的状态
        renderScrollBarObject();
        super.renderWindow();
    }

    private void renderScrollBarObject() {
        scrollBarObjectRepresentation = new Object();

        System.out.println(" render scroll bar in ScrollableWindow");
    }
}
