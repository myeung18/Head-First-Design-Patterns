package lang.lambda.func;

import lang.lambda.domain.Employee;
import lang.lambda.domain.Manager;

import java.util.function.BiFunction;

public class BiFunctionFunction {
    BiFunction<Employee, Manager, Employee> empManagerBiFunc = (emp, manager) ->
            emp.getManager().getPersonalAssistant();


    private void testBiFunction() {
    }


}
