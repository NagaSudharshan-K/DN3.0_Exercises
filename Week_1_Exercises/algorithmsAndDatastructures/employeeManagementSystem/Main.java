public class Main {
    private Employee[] employees;
    private int count;

    public Main(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
        } else {
            System.out.println("Array is full. Cannot add more employees.");
        }
    }

    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println("Employee ID: " + employees[i].getEmployeeId() +
                               ", Name: " + employees[i].getName() +
                               ", Position: " + employees[i].getPosition() +
                               ", Salary: $" + employees[i].getSalary());
        }
    }

    public void deleteEmployee(String employeeId) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[--count] = null;
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void main(String[] args) {
        Main ems = new Main(5);

        Employee e1 = new Employee("1", "Alice", "Developer", 75000);
        Employee e2 = new Employee("2", "Bob", "Manager", 90000);
        Employee e3 = new Employee("3", "Charlie", "Analyst", 60000);

        ems.addEmployee(e1);
        ems.addEmployee(e2);
        ems.addEmployee(e3);

        System.out.println("Traversing employees:");
        ems.traverseEmployees();

        System.out.println("\nSearching for employee with ID 2:");
        Employee e = ems.searchEmployee("2");
        System.out.println(e != null ? e.getName() : "Employee not found");

        System.out.println("\nDeleting employee with ID 3:");
        ems.deleteEmployee("3");

        System.out.println("\nTraversing employees after deletion:");
        ems.traverseEmployees();
    }
}
