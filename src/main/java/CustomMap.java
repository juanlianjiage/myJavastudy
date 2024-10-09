import java.util.HashMap;
import java.util.Map;

public class CustomMap<K, V> {
    private Map<K, V> valueMap;
    private Map<K, Integer> timestampMap;
    private V globalValue;
    private int timestamp;

    public CustomMap() {
        valueMap = new HashMap<>();
        timestampMap = new HashMap<>();
        globalValue = null;
        timestamp = 0;
    }

    // 设置指定key的值为value
    public void set(K key, V value) {
        valueMap.put(key, value);
        timestampMap.put(key, timestamp);
    }

    // 获取指定key的值
    public V get(K key) {
        if (!valueMap.containsKey(key)) {
            return null; // 如果key不存在，返回null
        }
        // 如果key的更新时间戳小于当前全局时间戳，返回全局值
        if (timestampMap.get(key) < timestamp) {
            return globalValue;
        }
        return valueMap.get(key); // 否则返回key的具体值
    }

    // 将所有key的值设置为value
    public void setAll(V value) {
        globalValue = value;
        timestamp++;
    }

    public static void main(String[] args) {
        CustomMap<String, Integer> map = new CustomMap<>();
        map.set("a", 1);
        map.set("b", 2);
        System.out.println(map.get("a")); // 输出1
        map.setAll(10);
        System.out.println(map.get("a")); // 输出10
        System.out.println(map.get("b")); // 输出10
        map.set("a", 5);
        System.out.println(map.get("a")); // 输出5
    }
}
