import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        String a[] = {"o", "r", "k", "g"};
        Arrays.sort(a);
        for (int i = 0; i<a.length; i++) {
            System.out.println(a[i]);
        }
        String x = "k";
        System.out.println(Arrays.binarySearch(a, 0, 2, x));
    }
}