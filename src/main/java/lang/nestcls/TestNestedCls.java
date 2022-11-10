package lang.nestcls;

public class TestNestedCls {
    private static int age;
    private String name;


    static class Helper {
        void printVariable() {
            System.out.println(age);
        }
    }
}
