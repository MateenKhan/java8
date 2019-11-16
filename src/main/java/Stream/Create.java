package Stream;

import java.util.stream.Stream;

public class Create {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4);

        //works fine
        Stream<Integer> stream0 = Stream.of(new Integer[]{1, 2, 3, 4});

        //Compile time error, Type mismatch: cannot convert from Stream<int[]> to Stream<Integer>
//        Stream<Integer> stream1 = Stream.of(new int[]{1, 2, 3, 4});

    }
}
