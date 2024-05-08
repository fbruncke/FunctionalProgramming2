import java.util.Collections;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Main mainInstance = new Main();

        //invoking a instance method
        Consumer<String> consumer1 = mainInstance::printMessage;
        //consumer1.accept("John");

        //mainInstance.executeConsumer1(consumer1);
        //mainInstance.printMessage("value");

        //invoking a static method
        Consumer<Integer> consumer2 = Main::printValue;
        //consumer2.accept(12);
    }

    private void printMessage(String name){
        System.out.println("Hello " + name);
    }

    private static void printValue(int val){
        System.out.println("number is: " + val);
    }


    private void executeConsumer1(Consumer<String> c)
    {
        c.accept("Value");

    }
}
