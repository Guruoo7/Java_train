import java.util.*;

public class Sample3 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("Ajith");
        al.add("Vijay");
        al.add("Thalapathy");
        al.add("Leo");
        al.add("Sachin");
        ListIterator<String> itr = al.listIterator();
        System.out.println("Traversing elements in forward direction");
        while (itr.hasNext()) {
            System.out.println("index:" + itr.nextIndex() + " value :" + itr.next());
        } 
            System.out.println("Traversing element in forward direction");
            while (itr.hasPrevious()) {
                System.out.println("ind:" + itr.previousIndex() + " value :" + itr.previous());
            }
        

    }

}