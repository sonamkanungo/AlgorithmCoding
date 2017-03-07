package lru;

/**
 * Created by kanunso on 2/11/17.
 */
public class LRUCacheAPI {

    public static void main(String args[]){

        LRUCache lrucache = new LRUCache(2);
        String a = "A", b= "B", c="C", d = "D";
        lrucache.fetch(a);
        lrucache.fetch(a);
        lrucache.traverse();
        lrucache.fetch(b);
        lrucache.traverse();
        lrucache.fetch(b);
        lrucache.traverse();
        lrucache.fetch(c);
        lrucache.traverse();
        lrucache.fetch(a);
        lrucache.traverse();
        lrucache.fetch(d);
        lrucache.traverse();
    }

}
