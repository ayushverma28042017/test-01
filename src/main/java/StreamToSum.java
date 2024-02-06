import java.util.*;
import java.util.stream.Collectors;

public class StreamToSum {
    public static void main(String[] args) {
        sumArray();

//        findAverage();
//        doSqueareFileAverage();
//        printEvenOdd();
//        findNumerStarWith2();
//        duplicate();
//        maxMin();
        sort();
    }

    static void sumArray() {
        int a[] = {1, 2, 3, 4, 5};
        OptionalInt res = Arrays.stream(a).reduce((i, j) -> i + j);
        System.out.println(res.getAsInt());
    }

    static void findAverage() {
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6);
        double res = data.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(res);

    }

    static void doSqueareFileAverage() {
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6);
        double result = data.stream()
                .map(e -> e * e)
                .filter(e -> e > 10)
                .mapToInt(e -> e + e)
                .average()
                .getAsDouble();

        System.out.println(result);
    }

    static void printEvenOdd() {
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> res = data.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(res);

    }

    static void findNumerStarWith2() {
        List<Integer> data = Arrays.asList(2, 22, 4, 5566, 22334);
        List<Integer> res = data.stream().
                map(e -> String.valueOf(e)).
                filter(k -> k.startsWith("2")).
                map(Integer::valueOf).
                collect(Collectors.toList());
        System.out.println(res);
    }

    static void duplicate() {
        List<Integer> data = Arrays.asList(2, 3, 7, 8, 9, 4, 3, 2, 6, 7, 1);
        Set<Integer> res = data.stream().filter(e -> Collections.frequency(data, e) > 1).collect(Collectors.toSet());
        System.out.println(res);
    }

    static void maxMin() {
        List<Integer> data = Arrays.asList(2, 3, 7, 8, 9, 4, 3, 2, 6, 7, 1);
        int max = data.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("MAx is:" + max);
        int min = data.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min is:" + min);
    }

    static void sort() {
        List<Integer> data = Arrays.asList(2, 3, 7, 8, 9, 4, 3, 2, 6, 7, 1);
        List<Integer> res = data.stream().sorted().collect(Collectors.toList());

        List<Integer> reverse = data.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("res is:" + res);
        System.out.println("Reverse  is:" + reverse);

    }
}
