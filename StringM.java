public class StringM {
    private int rollno;
    private String name;
    private String city;
    public StringM(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return rollno+" "+name+" "+city ;
    }

    public static void main(String[] args) {
        StringM s1 = new StringM(17, "guru", "Theni");
        System.out.println(s1);
    }
    

}
