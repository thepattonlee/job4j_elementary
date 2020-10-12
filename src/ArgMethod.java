public class ArgMethod {
    public static void Hello(String name,int age) {
        System.out.println("Hello," + name + age);
    }
    public static void main(String[]args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.Hello(name,age);
    }
}
