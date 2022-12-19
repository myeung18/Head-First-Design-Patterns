package lang.lambda.func;

import lang.lambda.domain.Employee;
import lang.lambda.domain.Manager;

import java.util.function.Function;

public class AdvFunc {
    Function<Employee, Manager> managerFinder = (emp) -> getManager(emp);
    Function<Manager, Employee> assistFinder = (manager) -> getPersonalAssistant(manager);

    private void testAndThen(Employee emp) {
        Function<Employee, Employee> empManagerAssiFinder = managerFinder.andThen(assistFinder);
    }

    private void testCompose(Employee emp) {
        Function<Employee, Employee> empFinder = assistFinder.compose(managerFinder);
    }

    private Employee getPersonalAssistant(Manager manager) {
        return manager.getPersonalAssistant();
    }

    private Manager getManager(Employee emp) {
        return null;
    }
}
