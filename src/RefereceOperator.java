import java.util.function.Consumer;

public class RefereceOperator {
    public static void main(String[] args) {
        RefereceOperator ro = new RefereceOperator();
        Consumer<String> definitionOfMethodRef = ro::callMe;
        Consumer<String> definitionOfMethodRefFull = x-> ro.callMe(x);

        definitionOfMethodRefFull.accept("Hello");
    }

    private void callMe(String payload)
    {
        System.out.println("I was called: " + payload);
    }
}
