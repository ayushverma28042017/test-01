package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStream {
    List<Employee> employelst = new ArrayList<>();

    TestStream() {
        employelst.add(new Employee("Ayush", 5600, "EM"));
        employelst.add(new Employee("KKyush2", 1500, "EM"));
        employelst.add(new Employee("QWEyush3", 2500, "EM"));
        employelst.add(new Employee("UTyush5", 5400, "EM"));
        employelst.add(new Employee("ZZrun", 2500, "SA"));
        employelst.add(new Employee("Pranav", 6000, "VP"));
        employelst.add(new Employee("CCKKRTT", 2800, "HR"));
        employelst.add(new Employee("YYatin", 3500, "TL"));
    }

    static void sortEmp(List<Employee> lst){

        // if separate comparator:
        Comparator<Employee> employeeNameComparator
                = Comparator.comparing(Employee::getName);

        List<Employee> sortedLst1 =lst.stream().sorted(employeeNameComparator).collect(Collectors.toList());

        List<Employee> sortedLst2 =lst.stream().sorted(Comparator.comparing(
                Employee::getName, (s1, s2) -> {
                    return s2.compareTo(s1);
                })).collect(Collectors.toList());

        //sortedLst1.stream().forEach(System.out::println);
        sortedLst2.stream().forEach(System.out::println);
    }


    static void  displayList(String s, List lst){
        lst.stream().forEach(System.out::println);
    }

    static void  displayMap( Map map){
        map.entrySet().stream().forEach(System.out::println);


    }
    public static void main(String[] args) {
        TestStream testStream = new TestStream();
        testStream.sortEmp(testStream.employelst);
//        List<Employee> emList = testStream.employelst.stream().
//                filter(d -> d.desigantion.equals("EM")).
//                collect(Collectors.toList());
//        displayList("Em list",emList);
//        // generate data map grouping by employee’s designation
//        Map<String, List<Employee>> resultMap = testStream.employelst.stream().
//                collect(Collectors.groupingBy(Employee::getDesigantion));
//        displayMap(resultMap);
//
//        //  calculate average salary of all employee in the list
//        //mapToInt:: >Returns an IntStream consisting of the results of applying the given function to the elements of this stream.
//        //This is an intermediate operation.
//        double averageSal = testStream.employelst.stream()
//                .mapToInt(e -> e.getSalary())
//                .average().getAsDouble();
////        System.out.println("Average Salary ::: "+averageSal);
//
//        // it is a coding style to implement program logic by composing functions and executing them in a data flow.
//
//        //a list of operations such as data transformation, filtering and sorting.
//        //Non-Terminal Operations:filter(),map() ,dinstinct(),sorted()
//        // Terminal: anyMathc(),collect(),count(),average(),sun(),min()
//
//        List<String> result = testStream.employelst.stream().
//                map(Employee::getDesigantion)
//                .distinct().
//                collect(Collectors.toList());
////        result.stream().forEach(System.out::println);
//
//        //Obtain a list of Emp belongs to category “EM” with price > ssalar >4k
//
//        List<Employee> resLst = testStream.employelst.stream().
//                filter(e -> e.getDesigantion().equals("EM")).
//                filter(e -> e.getSalary() > 4000)
//                .collect(Collectors.toList());
//        resLst.stream().forEach(System.out::println);


    }
}
