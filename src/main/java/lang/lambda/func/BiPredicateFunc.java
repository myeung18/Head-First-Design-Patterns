package lang.lambda.func;

import lang.lambda.domain.Employee;
import lang.lambda.domain.Manager;

import java.util.function.BiPredicate;

public class BiPredicateFunc {
    BiPredicate<Employee, Manager> empManagerPred = (emp, manager) -> emp.getManager().equals(manager) ? true : false;

    private void testBiPredicate(Employee emp, Manager manager) {
        System.out.println("is Manager: " + empManagerPred.test(emp, manager));
    }

    public static void main(String[] args) {
        Employee emp = new Employee(99);
        Manager manager = new Manager();
        emp.setManager(manager);

        new BiPredicateFunc().testBiPredicate(emp, manager);
    }
}
