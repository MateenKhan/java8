package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4);

        //works fine
        Stream<Integer> stream0 = Stream.of(new Integer[]{1, 2, 3, 4});

        //Compile time error, Type mismatch: cannot convert from Stream<int[]> to Stream<Integer>
//        Stream<Integer> stream1 = Stream.of(new int[]{1, 2, 3, 4});


        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 100; i++) myList.add(i);

//sequential stream
        Stream<Integer> sequentialStream = myList.stream();

//parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();


        Stream<String> stream1 = Stream.generate(() -> {
            return "abc";
        });
        Stream<String> stream2 = Stream.iterate("abc", (i) -> i);


        LongStream is = Arrays.stream(new long[]{1, 2, 3, 4});
        IntStream is2 = "abc".chars();

    }
}
