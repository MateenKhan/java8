package Stream;

import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        Optional<Integer> result = stream.reduce((i, j)->i*j);
        System.out.println(result.get());

    }
}
