package proxy;

public class ImageProxy implements Image{

    /**
     * 私有代理数据
     */
    private String imageFilePath;

    /**
     * 引用 RealSubject
     */
    private Image proxifiedImage;

    public ImageProxy(String imageFilePath){
        this.imageFilePath = imageFilePath;
    }
    
    @Override
    public void showImage() {

        // 只在需要渲染图片的时候才创建图片对象
        proxifiedImage = new HighResolutionImage(imageFilePath);
        
        proxifiedImage.showImage();
    }
}