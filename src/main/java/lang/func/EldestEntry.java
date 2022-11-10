package lang.func;

import java.util.Map;

@FunctionalInterface
interface EldestEntryRemovalFunction<K, V> {
    boolean remove(Map<K, V> map, Map.Entry<K, V> eldest);
}
