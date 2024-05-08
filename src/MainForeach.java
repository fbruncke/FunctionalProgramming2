import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class MainForeach {
    public static void main(String[] args) {

        Integer[] numbers = {1,5,7,9,3,34,456,11};
        List<Integer> myNumbers = Arrays.asList(numbers);

        myNumbers.stream().forEach(m->printValue(m) );
        //myNumbers.forEach(m->printValue(m) );

        System.out.println("anononymous version");
        //myNumbers.forEach(m-> System.out.println(m) );

    }

    private static void printValue(int val){
        System.out.println("number is: " + val);
    }















    private static void VerboseVersion()
    {
        Integer[] numbers = {1,5,7,9,3,34,456,11};
        List<Integer> myNumbers = Arrays.asList(numbers);

        Consumer<Integer> printConsumer= new Consumer<Integer>() {
            public void accept(Integer no) {
                System.out.println(no);
            }
        };
        myNumbers.stream().forEach(printConsumer);
    }


}
