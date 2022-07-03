import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Class> classList = getAllClasses();
        for(Class clazz: classList){
            Field[] fields = clazz.getDeclaredFields();
            Method[] methods = clazz.getDeclaredMethods();
            for (Field field : fields) {
                int modifiers = field.getModifiers();
                if (!Modifier.isPrivate(modifiers)) {
                    System.out.println("Field with name '" + field.getName() + "' should be private");
                }
                //check for setters
                if (!check(field.getName(), "set", methods)) {
                    System.out.println(clazz.getSimpleName() + " has no setter for '" + field.getName() + "'");
                }
                //check for getters
                if (!check(field.getName(), "get", methods)) {
                    System.out.println(clazz.getSimpleName() + " has no getter for '" + field.getName() + "'");
                }
            }
        }
    }

    private static boolean check(String fieldName, String article, Method[] methods) {
        String methodName = article + fieldName;
        for (Method method : methods) {
            if (methodName.equalsIgnoreCase(method.getName())) {
                return true;
            }
        }
        return false;
    }

    private static List<Class> getAllClasses() throws IOException, ClassNotFoundException {
        URL upackage = Main.class.getClassLoader().getResource("");

/*
        Main m = new Main();
        Class<?> c = m.getClass();
        String s = c.getSimpleName();

        соответствует

        String s = Main.class.getName();
*/

        String currentClass = Main.class.getName();

        BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream) upackage.getContent()));
        String line;
        List<Class> classes = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            String className = line.replace(".class", "");
            if (!className.equals(currentClass)) {
                classes.add(Class.forName(className));
            }
        }
        return classes;
    }

}
