package streamsAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamTry {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(1, 500));
        employeeList.add(new Employee(2, 1000));
        employeeList.add(new Employee(3, 1500));
        employeeList.add(new Employee(4, 2000));
        employeeList.add(new Employee(5, 2500));
        employeeList.add(new Employee(6, 3000));
        employeeList.add(new Employee(7, 3500));
        employeeList.add(new Employee(8, 4000));
        employeeList.add(new Employee(9, 4500));
// sorted list based on salary in decending order
List<Employee> empSortedList = employeeList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).skip(3)
        // .limit(3)
                .collect(Collectors.toList());

// System.out.println(empSortedList);
        
        empSortedList.forEach((element)->{
            System.out.println(element );
        });
    }

}


class Employee {
    int id;
    long salary;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public Employee(int id, long salary) {
        this.id = id;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", salary=" + salary + "]";
    }
}