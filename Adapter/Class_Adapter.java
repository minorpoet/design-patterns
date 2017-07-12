class Client{
    private Target target;

    public Client(Target target){
        this.target = target;
    }

    public void doSomething(){
        this.target.request();
    }
}

interface Target {
    void request();
}

class Adaptee{
    public void specialRequest(){
        System.out.println("special request in Adaptee");
    }
}

class Adapter extends Adaptee implements Target{
    public void request(){
        this.specialRequest(); // implementation + inheritance => likely  multi inherit
    }
}
