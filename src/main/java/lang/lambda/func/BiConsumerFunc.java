package lang.lambda.func;

import lang.lambda.domain.Employee;

import java.util.function.BiConsumer;

public class BiConsumerFunc {
    BiConsumer<Employee, Integer> empBonus = (emp, bonus) -> System.out.printf("Employee %s is set of %d pct of bonus: ", emp, bonus);

    BiConsumer<Employee, Integer> empSalaryHike = (emp, sal) ->
            System.out.printf("Employee %s is receiving %d hike in salaray", emp, sal);


    private void testBiConsumer(Employee emp, Integer bonus, Integer salary) {
        empBonus.accept(emp, bonus);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(10);
        new BiConsumerFunc().testBiConsumer(emp, 5, 15);
    }
}
