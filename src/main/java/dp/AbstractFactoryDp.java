package dp;


// Abstract Factory Pattern
interface AbstractProductA {
    void operationA();
}

interface AbstractProductB {
    void operationB();
}

class ConcreteProductA1 implements AbstractProductA {
    public void operationA() {
        System.out.println("Operation A1");
    }
}

class ConcreteProductB1 implements AbstractProductB {
    public void operationB() {
        System.out.println("Operation B1");
    }
}

interface AbstractFactory {
    AbstractProductA createProductA();
    AbstractProductB createProductB();
}

class ConcreteFactory1 implements AbstractFactory {
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}

public class AbstractFactoryDp {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();
        productA.operationA(); // Output: Operation A1
        productB.operationB(); // Output: Operation B1
    }
}
