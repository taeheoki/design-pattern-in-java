package shop.taeheoki.designpatterns._02_structural_patterns._06_adapter;

interface Target {
    void request();
}

class ClassA {
    void specificRequest() {
        System.out.println("Class A specific request");
    }
}

class Adapter implements Target {

    private ClassA classA;

    public Adapter(ClassA classA) {
        this.classA = classA;
    }

    @Override
    public void request() {
        classA.specificRequest();
    }
}

public class Client {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        Target target = new Adapter(classA);
        target.request();
    }
}
