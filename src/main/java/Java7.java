import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Java7 {


    private static int sumIterator(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while (it.hasNext()) {
            int num = it.next();
            if (num > 10) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,20,30,40);
        System.out.println(sumIterator(list));
    }

}
