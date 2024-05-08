import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args) {
        int[] integers = new int[] {20, 98, 12, 7, 35,10};
        int min = Arrays.stream(integers)
                .min()
                .getAsInt(); // returns 7
        System.out.println("Min is: " + min);

        int sum = Arrays.stream(integers).sum();
        System.out.println("Sum is: " + sum);


        List<Integer> myNumbers = Arrays.stream(integers)
                                        .boxed()
                                        .collect(Collectors.toList());

        myNumbers.stream()
                .filter(l->l >= 12)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
                //.forEach(x-> System.out.println(x));



/*
        teachers.stream()
                .filter(t->t.isCSTeacher())
                .forEach(sendMailWithGroupParticipants());
                */
    }
}
