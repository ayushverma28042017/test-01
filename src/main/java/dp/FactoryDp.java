package dp;

// Factory Method Pattern
interface Product {
    void operation();
}

class ConcreteProductA implements Product {
    public void operation() {
        System.out.println("Operation in ConcreteProductA");
    }
}

class ConcreteProductB implements Product {
    public void operation() {
        System.out.println("Operation in ConcreteProductB");
    }
}

abstract class Creator {
    abstract Product factoryMethod();
}

class ConcreteCreatorA extends Creator {
    Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    Product factoryMethod() {
        return new ConcreteProductB();
    }
}

public class FactoryDp {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreatorA();
        Product product = creator.factoryMethod();
        product.operation(); // Output: Operation in ConcreteProductA
    }
}
