import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("phi", "male", "1/1/1990");
        Employee employee2 = new Employee("phuong", "female", "1/1/1991");
        Employee employee3 = new Employee("hieu", "male", "1/1/1992");
        Employee employee4 = new Employee("thuy", "female", "1/1/1993");
        ListEmployee listEmployee = new ListEmployee();
        listEmployee.add(employee1);
        listEmployee.add(employee2);
        listEmployee.add(employee3);
        listEmployee.add(employee4);
        for (Employee employee : listEmployee.listEmployee) {
            System.out.println(employee.toString());
        }
        System.out.println();

        Queue<Employee> queueFemale = new LinkedList<>();
        for (Employee employee : listEmployee.listEmployee) {
            if (employee.getGender().equalsIgnoreCase("female")) {
                queueFemale.add(employee);
            }
        }
        Queue<Employee> queueMale = new LinkedList<>();
        for (Employee employee : listEmployee.listEmployee) {
            if (employee.getGender().equalsIgnoreCase("male")) {
                queueMale.add(employee);
            }
        }
        
        LinkedList<Employee> outputListEmployee = new LinkedList<>();
        while (queueFemale.size() != 0) {
            outputListEmployee.add(queueFemale.remove());
        }
        while (queueMale.size() != 0) {
            outputListEmployee.add(queueMale.remove());
        }
        for (Employee employee : outputListEmployee) {
            System.out.println(employee.toString());
        }
    }
}
