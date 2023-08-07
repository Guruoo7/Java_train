abstract class Test1 {
    public abstract void show();
    public void display() {
        System.out.println("Hi this is JAVA");
    }
    public void test1() {
        System.out.println("Hi this is Guru");
    }
    public static void test2() {
        System.out.println("Hi this is PYTHON");
    }
    public static void test3() {
        System.out.println("Hi this is prasanth");
    }
}

    class Abstracts extends Test1 {
        @Override
        public void show(){
            System.out.println("Guruprasanth");
        }
    
    public static void main(String[] args) {
       Abstracts s2 = new Abstracts();
       s2.show(); 
       s2.display();
       s2.test1();
       Abstracts.test2();
       Abstracts.test3();
    }   
}
