package Stream;

import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Mateen","Ahmed");
        Stream<String> upperCaseStringStream = stringStream.map(i -> {
            return  i.toUpperCase();
        });
        upperCaseStringStream.forEach(i -> System.out.print(i+" "));
    }
}
