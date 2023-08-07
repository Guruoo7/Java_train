import java.io.*;

class Dog7 implements Serializable{
    int i = 10;
    transient final int j = 20;
}
public class GFG {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Dog7 d1 = new Dog7();
        System.out.println("Serialization Started");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\mguru\\Downloads\\abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
        System.out.println("Serialization Ended");

        System.out.println("deSerialization Started");
        FileInputStream fis = new FileInputStream("C:\\Users\\mguru\\Downloads\\abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog7 d2 = (Dog7) ois.readObject();
        oos.writeObject(d2);
        System.out.println("Deserialization Ended");
        System.out.println("Dog object data");
        System.out.println(d2.i + "\t" + d2.j);
    }
}
