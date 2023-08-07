import java.util.ArrayList;

import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(7);
        l1.add(17);
        l1.add(5);
        l1.add(8);
        Iterator<Integer> it = l1.iterator();
        while(it.hasNext()){
        System.out.println(it.next());
        }
    }    
}
