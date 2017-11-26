package designpattern.decorator;

/**
 * 装饰者父类
 */
public abstract class DecoratedWindow implements Window {
    /**
     * 待装饰的对象
     */
    private Window _windowReference = null;
    public DecoratedWindow(Window windowReference){
       this._windowReference = windowReference;
    }

    @Override
    public void renderWindow() {
        this._windowReference.renderWindow();
    }
}
