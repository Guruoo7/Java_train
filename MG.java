import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MG {
    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("mango");
        fruitList.add("Apple");
        fruitList.add("Grapes");
        fruitList.add("Strawberry");
        String[] array = fruitList.toArray(new String[fruitList.size()]);
        System.out.println("Printing Array: " + Arrays.toString(array));
        System.out.println("Printing List: " + fruitList);
    }
}
