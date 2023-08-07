import java.util.Arrays;

public class ArrayFunc {
    public static void main(String[] args){
        int a[][] = {{12,23,24,56,78}};
        int b[][] = {{5,6,21,45,43}};
        // System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepEquals(a, b));
    }
}