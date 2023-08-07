public class StringB {
    public static void main(String[] args) {
        String s = "Guru";
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());
        System.out.println(sb.replace(0, 2, "pr"));
        System.out.println(sb.append("Guru"));
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.insert(3, "M"));
    }
}