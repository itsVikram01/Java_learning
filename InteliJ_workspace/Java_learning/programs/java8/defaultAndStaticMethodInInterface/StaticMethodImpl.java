package java8.defaultAndStaticMethodInInterface;

@FunctionalInterface
interface MyFunctionalInterface {
    void execute();

    static void printInfo() {
        System.out.println("This is a functional interface");
    }
}

public interface StaticMethodImpl {
    public static void main(String[] args) {
        MyFunctionalInterface.printInfo();
    }
}
