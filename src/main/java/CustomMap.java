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

    // ����ָ��key��ֵΪvalue
    public void set(K key, V value) {
        valueMap.put(key, value);
        timestampMap.put(key, timestamp);
    }

    // ��ȡָ��key��ֵ
    public V get(K key) {
        if (!valueMap.containsKey(key)) {
            return null; // ���key�����ڣ�����null
        }
        // ���key�ĸ���ʱ���С�ڵ�ǰȫ��ʱ���������ȫ��ֵ
        if (timestampMap.get(key) < timestamp) {
            return globalValue;
        }
        return valueMap.get(key); // ���򷵻�key�ľ���ֵ
    }

    // ������key��ֵ����Ϊvalue
    public void setAll(V value) {
        globalValue = value;
        timestamp++;
    }

    public static void main(String[] args) {
        CustomMap<String, Integer> map = new CustomMap<>();
        map.set("a", 1);
        map.set("b", 2);
        System.out.println(map.get("a")); // ���1
        map.setAll(10);
        System.out.println(map.get("a")); // ���10
        System.out.println(map.get("b")); // ���10
        map.set("a", 5);
        System.out.println(map.get("a")); // ���5
    }
}
