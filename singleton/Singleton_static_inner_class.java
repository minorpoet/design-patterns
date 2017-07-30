// 静态内部类
class Singleton{    
    private Singleton(){}
    private static class SingletonHolder{
        public static final Singleton INSTANCE = new Singleton();
    }

    public Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }    
}
