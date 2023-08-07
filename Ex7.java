import java.util.*;

public class Ex7 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Strawberry");
        list1.add("Grapes");
        Collections.sort(list1);
        for(String fruit:list1){
            System.out.println(fruit);
        }
    }
}
