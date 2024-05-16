//Create a generic class Pair<K,V> with private variables key and value.
//The class Pair should define a parameterised constructor and getter and
//        setter methods for these attributes. After addition of objects, the main
//class should retrieve and print the pair of key and value.
package sem_4_Assignments.Assignment_3;

public class pairMain {
    public static void main(String[] args) {
        Pair<Integer,Integer> p1 = new Pair<>(1,2);
        System.out.println(p1.getKey()+" "+p1.getValue());
    }
}
class Pair<K,V>{

    private K Key;
    private V value;
    Pair(K key,V value){
        this.Key = key;
        this.value = value;
    }

    public K getKey() {
        return Key;
    }

    public void setKey(K key) {
        Key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
