package proxy;

/**
 * Image Viewer Promgram
 */
public class ImageViewer {
    public static void main(String[] args) {
        // 假设用户选中有三张图片的文件夹

        // 创建3个图片对象
        Image highResolutionImage1 = new ImageProxy("sample/veryHighResPhoto1.jpeg");
        Image highResolutionImage2 = new ImageProxy("sample/veryHighResPhoto2.jpeg");
        Image highResolutionImage3 = new ImageProxy("sample/veryHighResPhoto3.jpeg");

        // 假设用户点击列表中的一个图片，这只会引起程序调用这个图片的 showImage() 方法。
        // 注意，这种情况只会把这张图片加载进内存
        highResolutionImage1.showImage();

        // 思考下， 如果直接使用 HighResolutionImage 对象会怎么样
        Image highResolutionImageNoProxy1 = new HighResolutionImage("sample/veryHighResPhoto1.jpeg");
        Image highResolutionImageNoProxy2 = new HighResolutionImage("sample/veryHighResPhoto2.jpeg");
        Image highResolutionImageNoProxy3 = new HighResolutionImage("sample/veryHighResPhoto3.jpeg");

        // 如果用户只选中了图片2， 由于这种情况所有图片都已经加载到内存中了，
        // 但是用户并没有查看所有图片，内存就浪费了
        highResolutionImageNoProxy2.showImage();
        
    }

}