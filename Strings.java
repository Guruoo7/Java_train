public class Strings {
    public static void main(String[] args) {
        String s1 = "Guru";
        System.out.println(s1.charAt(3));
        System.out.println(s1.lastIndexOf("u"));
        System.out.println(s1.length());

        String s2 = "Today is Friday";
        System.out.println(s2.trim().substring(2, 5));
        System.out.println(s2.contains("Friday"));

        String s3 = "  Prasanth  ";
        System.out.println(s3.length());
        System.out.println(s3.trim());
        System.out.println(s3.trim().substring(3).length());

        System.out.println("Guru".equals(s1));
    }
}
