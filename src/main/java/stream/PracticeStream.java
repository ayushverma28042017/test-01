package stream;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeStream {
    public static void main(String[] args) {
        List<Employee> allEmp = new ArrayList<>();
        Employee e1 = new Employee("Ayush1", 35600, "EM1");
        Employee e2 = new Employee("Ayush2", 5600, "HR");
        Employee e3 = new Employee("Ayush3", 25600, "PM");
        Employee e4 = new Employee("Ayush4", 15600, "CEO");
        allEmp.add(e1);
        allEmp.add(e2);
        allEmp.add(e3);
        allEmp.add(e4);
        example2(allEmp);
    }

    static  void example1(List<Employee> allemp){

        List<Employee> resultLst =allemp.stream().filter(e -> e.getSalary() >10000)
                .collect(Collectors.toList());

//        resultLst.forEach(System.out::println);
    }

    static  void example2(List<Employee> allemp){

        Integer resultLst =allemp.stream()
                        .mapToInt(e-> e.getSalary())
                                .sum();
       System.out.println(resultLst);

        OptionalDouble resultLst2 =allemp.stream()
                .mapToInt(e-> e.getSalary())
                        .average();
        System.out.println(resultLst2);
        List<Employee> sortedLSt =allemp.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        List<Employee> sortedLSt2 =allemp.stream().sorted(Comparator.comparing(e-> e.getName())).collect(Collectors.toList());
//        List<Object> sortedLSt3 =allemp.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//      boolean rrss =allemp.stream().reduce( (e, k )-> e.getDesigantion().equals(k.getDesigantion()));

        List<Employee> sortedLSt4 =allemp.stream().sorted((o1, o2)->o1.getName().compareTo(o2.getName())).collect(Collectors.toList()).stream()
                .collect(Collectors.toList());
//        sortedLSt.forEach(System.out::println);
//        sortedLSt2.forEach(System.out::println);
        //res44.forEach(System.out::println);
//        sortedLSt3.forEach(System.out::println);


    }


}
