package lab_07.lab_07_01;

import java.util.List;

public class ControllerEmployee {

    public int calTotalSalaryEmployee(List<Employee> employees) {

        int totalSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }

        return totalSalary;
    }
}
