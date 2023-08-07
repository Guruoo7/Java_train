import java.util.*;

public class Ex17 {
    public static void main(String[] args) {

        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Dawood");
        hash_Set.add("Priya");
        hash_Set.add("Kavi");
        hash_Set.add("Guru");
        System.out.println(hash_Set);
        
        String check = "Priya";
        System.out.println("Contains " + check + " " + hash_Set.contains(check));

        hash_Set.remove("Guru");
        System.out.println("After removing element: " + hash_Set);

        for(String value: hash_Set){
            System.out.println(value + ", ");
        }

        Iterator<String> i = hash_Set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        hash_Set.add("Priya");
        System.out.println("Iterating over set: ");
        Iterator<String> g = hash_Set.iterator();
        while (g.hasNext()) {
            System.out.println(g.next());
        }

    }
}
