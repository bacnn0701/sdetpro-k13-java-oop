package lab_07.lab_07_01;

import java.util.Arrays;
import java.util.List;

public class TestEmployee {

    public static void main(String[] args) {

        Employee fullTime1 = new FulltimeEmployee();
        Employee fullTime2 = new FulltimeEmployee();
        Employee fullTime3 = new FulltimeEmployee();

        Employee contract1 = new ContractEmployee();
        Employee contract2 = new ContractEmployee();

        List<Employee> employees = Arrays.asList(fullTime1,fullTime2,fullTime3,contract1,contract2);

        ControllerEmployee controllerEmployee = new ControllerEmployee();

        System.out.println(controllerEmployee.calTotalSalaryEmployee(employees));

    }
}
