package Stream;

import java.util.stream.Stream;

public class Match {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        boolean  result  = stream.anyMatch(integer -> integer > 0);
        System.out.println(result);

        Stream<Integer> stream2 = Stream.of(11,22,31,42,53);
        System.out.println(stream2.allMatch( i -> i>10));

        Stream<Integer> stream3 = Stream.of(2,4,6,8,10);
        System.out.println(stream3.anyMatch( i -> i%10 ==0));

    }
}
