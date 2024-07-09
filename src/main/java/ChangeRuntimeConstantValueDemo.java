import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ChangeRuntimeConstantValueDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        System.out.println(Demo4.MY_CONSTANT);

//        Demo4.MY_CONSTANT=5.15;

        Field myConstant = Demo4.class.getDeclaredField("MY_CONSTANT");
        myConstant.setAccessible(true);

        System.out.println(myConstant.getModifiers());

        // Remove the final modifier
        //This works only upto java 10
//        Field modifiersField = Field.class.getDeclaredField("modifiers");
//        modifiersField.setAccessible(true);
//        modifiersField.setInt(myConstant, myConstant.getModifiers() & ~Modifier.FINAL);

        myConstant.set(null, 5);
        System.out.println(Demo4.MY_CONSTANT);
    }
}

class Demo4 {
    public static final Object MY_CONSTANT = Double.valueOf(3.14);
}