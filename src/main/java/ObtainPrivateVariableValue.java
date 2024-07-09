import java.lang.reflect.Field;

public class ObtainPrivateVariableValue {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field dontTouchMe = Demo2.class.getDeclaredField("dontTouchMe");
        dontTouchMe.setAccessible(true);
        int value = (int) dontTouchMe.get(Demo2.class);
        System.out.println(value); //5

    }
}

class Demo2 {
    private static int dontTouchMe = 5;
}
