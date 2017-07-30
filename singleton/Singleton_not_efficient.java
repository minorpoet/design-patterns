// 线程安全，但是性能不好， 即时instance已经实例化了 还要同步
class Singleton{
    private static Singleton instance;
    private Singleton(){}
 
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}