package designPattern.creationalDesignPattern.abstractFactory;

// Abstract Product
interface Chair {
    void create();
}

// Concrete Product A
class VictorianChair implements Chair {
    @Override
    public void create() {
        System.out.println("Victorian Chair created.");
    }
}

// Concrete Product B
class ModernChair implements Chair {
    @Override
    public void create() {
        System.out.println("Modern Chair created.");
    }
}

// Abstract Factory
interface FurnitureFactory {
    Chair createChair();
}

// Concrete Factory A
class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}

// Concrete Factory B
class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}

// Client
public class AbstractFactoryExample {
    public static void main(String[] args) {
        FurnitureFactory factory = new VictorianFurnitureFactory();
        Chair chair = factory.createChair();
        chair.create();

        factory = new ModernFurnitureFactory();
        chair = factory.createChair();
        chair.create();
    }
}
