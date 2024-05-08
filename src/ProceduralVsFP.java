import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProceduralVsFP {
    public static void main(String[] args) {

        List<String> lowerCaseStrings = Arrays.asList("a", "b", "c", "d");

        //Procedural
        List<String> upperCaseStrings = new ArrayList<>();
        for (String s : lowerCaseStrings) {
            upperCaseStrings.add(s.toUpperCase());
        }
        System.out.println(upperCaseStrings);

        //FP approach
        List<String> upperCaseStringsFP = lowerCaseStrings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseStringsFP);
    }
}
