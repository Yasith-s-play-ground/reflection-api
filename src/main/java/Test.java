public class Test {
    public static void main(String[] args) {
        System.out.println(Demo.class == new Demo().getClass()); //true
        System.out.println(Demo.class instanceof Class); //true
        System.out.println(Demo.class instanceof Object); //true

        System.out.println("----------------------------------------");

        System.out.println(Customer.class == new Customer().getClass()); //true
//        System.out.println(Customer.class == Demo.class);
//        System.out.println(new Customer().getClass() == new Demo().getClass());

        System.out.println("----------------------------------------");
        System.out.println(Demo.class); //class Demo
        System.out.println(new Demo().getClass()); //class Demo
    }
}
