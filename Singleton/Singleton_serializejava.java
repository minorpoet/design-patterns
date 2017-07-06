// 为了防止，序列化和反序列化的过程中创建多个实例，实现了Serializable接口的单例类，必须实现 readResolve方法
 class Singleton implements Serializable{
    
    // 此方法在对象反序列化之后调用
    protected Object readResolve() {
        return getInstance();
    }
}