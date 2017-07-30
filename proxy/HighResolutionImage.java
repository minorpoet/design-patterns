package proxy;

/**
 * RealSubject
 */
public class HighResolutionImage implements Image{
    public HighResolutionImage(String imageFilePath){
        loadImage(imageFilePath);
    }

    private void loadImage(String imageFilePath){
        // load image from  disk into memory
        // 将图片从硬盘加载到内存中
        // this is heavy and costly operation            
        // 这是一个大开销的操作
    }
}