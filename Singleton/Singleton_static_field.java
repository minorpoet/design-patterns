// 利用静态成员预先加载
class Singleton{
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance(){
        return instance;
    }
}

