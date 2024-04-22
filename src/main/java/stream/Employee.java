package stream;


public class Employee implements Comparable {
    public Employee(String name, int salary, String desigantion) {
        this.name = name;
        this.salary = salary;
        this.desigantion = desigantion;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    int salary;

    public String getDesigantion() {
        return desigantion;
    }

    public void setDesigantion(String desigantion) {
        this.desigantion = desigantion;
    }

    String desigantion;

    @Override
    public int compareTo(Object o) {
        String cast = (String)o;
       return this.getName().compareTo(cast);
    }
}
