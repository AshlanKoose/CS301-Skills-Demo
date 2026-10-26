import java.util.*;

public class HashST<Key, Value> {
    private int m = 1024;
    private Node[] lists = new Node[m];
    
    private class Node {
        private Object key;
        private Object val;
        private Node next;
    
        public Node(Object key, Object val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }
    private int hash(Key key){
        return Math.abs(key.hashCode() % m);
    }
    public Value get(Key key) {
    int i = hash(key);
    for (Node x = lists[i]; x != null; x = x.next)
        if (key.equals(x.key))
            return (Value) x.val;
    return null;
    }
    public void put(Key key, Value val) {
        int i = hash(key);
        for (Node x = lists[i]; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.val = val;
                return;
            }
        }
        lists[i] = new Node(key, val, lists[i]);
    }
    //code added myself starts here, everything else previously is from the textbook
        public boolean contains(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("Key is null.");
        }
        return get(key) != null;
    }
        public int size() {
        return m; //since in the textbook, m is the number of linked lists
    }
        public LinkedList keys(Key key)  { //for transparency I based this off of the get method from the book
        LinkedList<Key> first = new LinkedList<Key>();
        int i = hash(key);
        for (Node x = lists[i]; x != null; x = x.next){
            if (key.equals(x.key)){
                first.add(key);
            }
        }
        return first;
    }
}