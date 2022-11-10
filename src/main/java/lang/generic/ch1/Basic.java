package lang.generic.ch1;

import java.util.ArrayList;
import java.util.List;

public class Basic {
    void method() {
        List<Object> objects = new ArrayList<>();
        objects.add("hello");
        System.out.println(objects);


        List<? extends Number> nums = new ArrayList<>();
//        nums.add(1);

    }
}
