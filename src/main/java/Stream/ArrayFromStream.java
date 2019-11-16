package Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayFromStream {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4);
        Integer arr[] = stream.toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
