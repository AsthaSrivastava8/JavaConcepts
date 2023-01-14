package collectionsTransformation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryGreaterThan {
    public static void main(String[] args) {
        List<GroupedByDepartment.Employee> employeeList = new ArrayList<>();
        employeeList.add(new GroupedByDepartment.Employee(101, "Hermione Granger", "Department of Magical Law Enforcement", 15000, "Meadway", "hermione@gmail.com"));
        employeeList.add(new GroupedByDepartment.Employee(102, "Harry Potter", "Department of Mysteries", 10000, "Pivot Drive", "harry@gmail.com"));
        employeeList.add(new GroupedByDepartment.Employee(103, "Ronald Weasley", "Department of Magical Law Enforcement", 10000, "Meadway", "ron@gmail.com"));
        employeeList.add(new GroupedByDepartment.Employee(104, "Kingsley Shacklebolt", "Department of Mysteries", 25000, "Diagon Alley", "kinsgley@gmail.com"));
        employeeList.add(new GroupedByDepartment.Employee(105, "Dobby", "Hogwarts Kitchen", 10, "hogwarts", "the-free-elf@gmail.com"));

        List<GroupedByDepartment.Employee> filteredList = employeeList.stream()
                .filter(e -> e.getSalary() > 10000)
                .collect(Collectors.toList());

        filteredList.stream().map(e -> e.getName()).forEach(System.out::println);

    }
}
