package lang.lambda;

public class Lambda {
    public interface Email{
        String constructEmail(String name);
    }

    public static void main(String[] args) {
        Email em = (String name) -> name + "@hotmail.com";

        System.out.println(em);
    }
}
