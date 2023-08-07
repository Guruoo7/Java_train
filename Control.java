public class Control {
    public static void main(String[] args) {
        int mark = 40;
        if (mark > 90) {
            System.out.println("A+");
        }
        else if (mark > 75) {
            System.out.println("A");
        }
        else if (mark > 65) {
            System.out.println("B+");
        }
        else if (mark > 55) {
            System.out.println("B");
        }
        else if (mark > 45) {
            System.out.println("C");
        }
        else {
            System.out.println("Fail");
        }
    }
}
 