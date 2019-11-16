package Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        Stream<Integer> stream = arrayList.stream();
        Stream<Integer> filterdStream = stream.filter(p -> p > 90);
        filterdStream.forEach( k -> System.out.print(k+" "));

    }
}
