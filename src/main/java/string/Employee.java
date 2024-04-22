package string;

import java.util.*;
import java.util.stream.Collectors;


public class Employee {
    public String getName() {
        return name;
    }

    private String name;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    private String department;

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    private double salary;

    // Constructor, getters

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        // Populate the list of employees
        employees.add(new Employee("John", "HR", 50000));
        employees.add(new Employee("Alice", "IT", 60000));
        employees.add(new Employee("Bob", "HR", 55000));
        employees.add(new Employee("Carol", "Finance", 70000));
        employees.add(new Employee("David", "IT", 62000));
        employees.add(new Employee("Eva", "Finance", 75000));

        // Group employees by department and find max salary for each department
        Map<String, Double> maxSalaries = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getSalary, Collectors.maxBy(Comparator.naturalOrder()))))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().orElse(0.0)));

        // Print the result
//        maxSalaries.forEach((department, maxSalary) ->
//                System.out.println("Max salary in department " + department + " is " + maxSalary));

        test01(employees,maxSalaries);
    }

    static void test01(List<Employee> employees,Map<String, Double> display){
        // print a map
        List<String> allNmae = employees.stream().map(e-> e.getName()).collect(Collectors.toList());
        List<String> aaNames = new ArrayList<>();

        //employees.forEach((department)-> System.out.println("Deparment is :: "+ department +"salary is::"+department.getSalary()));
        display.forEach((department,salary)-> System.out.println("Deparment is :: "+ department +"salary is::"+salary));
        Map<String,Long> res = employees.stream()
                .collect(Collectors.
                        groupingBy(Employee::getDepartment,Collectors.counting()));


        Map<String, Double> sum = employees.stream().collect(
                Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));

        sum.forEach((d,s)-> System.out.println("Department :" +d + "Sum of Salary "+s));
//
//        Map<String,String> res2;
//        res2 = employees.stream()
//                .collect(Collectors.
//                        groupingBy(Employee::getDepartment,aaNames.add(Employee::getName)));

        Map<String, Long> counting = employees.stream().collect(
                Collectors.groupingBy(Employee::getName, Collectors.counting()));
    }
}
