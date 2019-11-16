import java.util.Arrays;
import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,20,30,40);
        System.out.println(sumStream(list));
    }


    private static int sumStream(List<Integer> list) {
        return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
    }

}
