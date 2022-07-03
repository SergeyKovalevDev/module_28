import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> arrayList = Class.forName("java.util.ArrayList");
        int modifiers = arrayList.getModifiers();
        System.out.println("ArrayList class is public: " + Modifier.isPublic(modifiers));
        System.out.println("ArrayList class is protected: " + Modifier.isProtected(modifiers));

        Class<?> abstractList = Class.forName("java.util.AbstractList");
        modifiers = abstractList.getModifiers();
        System.out.println("AbstractList class is static: " + Modifier.isStatic(modifiers));
        System.out.println("AbstractList class is abstract: " + Modifier.isAbstract(modifiers));

        Class<?> collection = Class.forName("java.util.Collection");
        modifiers = collection.getModifiers();
        System.out.println("Collection class is interface: " + Modifier.isInterface(modifiers));
    }
}
