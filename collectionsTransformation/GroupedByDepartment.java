package collectionsTransformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupedByDepartment {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Hermione Granger", "Department of Magical Law Enforcement", 15000, "Meadway", "hermione@gmail.com"));
        employeeList.add(new Employee(102, "Harry Potter", "Department of Mysteries", 10000, "Pivot Drive", "harry@gmail.com"));
        employeeList.add(new Employee(103, "Ronald Weasley", "Department of Magical Law Enforcement", 10000, "Meadway", "ron@gmail.com"));
        employeeList.add(new Employee(104, "Kingsley Shacklebolt", "Department of Mysteries", 25000, "Diagon Alley", "kinsgley@gmail.com"));
        employeeList.add(new Employee(105, "Dobby", "Hogwarts Kitchen", 10, "hogwarts", "the-free-elf@gmail.com"));

        Map<String, List<Employee>> byDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));

        for (Map.Entry<String, List<Employee>> ele : byDepartment.entrySet()) {
            System.out.println(ele.getKey() + " - " + ele.getValue().stream().map(e -> e.getName()).collect(Collectors.toList()));
        }

    }

    static class Employee {
        private int id;
        private String name;
        private String department;
        private int salary;
        private String address;
        private String email;

        public Employee(int id, String name, String department, int salary, String address, String email) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
            this.address = address;
            this.email = email;
        }


        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public int getSalary() {
            return salary;
        }

        public String getAddress() {
            return address;
        }

        public String getEmail() {
            return email;
        }
    }
}
