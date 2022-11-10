package lang.method;

import java.util.*;

public class item55 {
    public static <E extends Comparable<E>> E max(Collection<E> c) throws IllegalAccessException {
        if (c.isEmpty()) {
            throw new IllegalAccessException("Empty");
        }

        E res = null;
        for (E e : c) {
            if (res == null || e.compareTo(res) > 0) {
                res = Objects.requireNonNull(e);
            }
        }

        return res;
    }

    public static <E extends Comparable<E>> Optional<E> max2(Collection<E> c) {
        if (c.isEmpty()) {
            return Optional.empty();
        }

        E res = null;
        for (E e : c) {
            if (res == null || e.compareTo(res) > 0) {
                res = Objects.requireNonNull(e);
            }
        }

        return Optional.ofNullable(res);
    }

    public static <E extends Comparable<E>> Optional<E> max3(Collection<E> c) {
        return c.stream().max(Comparator.naturalOrder());
    }

    /**
     * <table border="1">
     *   <tr>
     *     <td> cell 11 </td> <td> cell 21</td>
     *   </tr>
     *   <tr>
     *     <td> cell 12 </td> <td> cell 22</td>
     *   </tr>
     * </table>
     */
    public void caller() {
    }

    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
