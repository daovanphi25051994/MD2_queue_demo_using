import java.util.LinkedList;

public class ListEmployee extends Employee {
    LinkedList<Employee> listEmployee;
    public ListEmployee(){
        listEmployee = new LinkedList<>();
    }
    public boolean add(Employee employee){
        listEmployee.add(employee);
        return true;
    }
}
