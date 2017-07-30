class Client{
    private Target  target;

    public Client(Target target){
        this.target = target;
    }

    public void doSomething(){
        target.request();
    }

    public static void main(String[] args){
        Client client = new Client(new Adapter(new Adaptee())); // 这些的都可以用 ioc 来构造注入
        client.request();    
    }

}

interface Target{
    void request();
}

class Adapter implements Target{
    private Adaptee adaptee; // dependency

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    
    // delegate request to specialRequest
    public void request(){
        System.out.println("delegating...");
        this.adaptee.specialRequest();
    }
}

class Adaptee {
    void specialRequest(){
        System.out.println("special request");
    }
}

