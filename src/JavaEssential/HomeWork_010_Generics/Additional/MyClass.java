package JavaEssential.HomeWork_010_Generics.Additional;

public class MyClass<T> {
    public static <T> void factoryMethod(T type){
        System.out.println(type);
        System.out.println(type.getClass());
    }

    public static void main(String[] args) {
        factoryMethod(2.13);

    }
}

