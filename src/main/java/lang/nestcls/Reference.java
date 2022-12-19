package lang.nestcls;

public class Reference {
    public static void main(String[] args) {
        Outer.invoke(() -> 44);
    }
}
