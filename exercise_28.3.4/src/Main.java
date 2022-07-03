import annotations.ClassAuthor;

public class Main {

    public static void main(String[] args) {
/*
        SomeClass someClass = new SomeClass("asdsdfg");
        Class<?> clazz = someClass.getClass();
        ClassAuthor annotation = clazz.getAnnotation(ClassAuthor.class);
*/
        ClassAuthor annotation = SomeClass.class.getAnnotation(ClassAuthor.class);
        System.out.println("Author: " + annotation.classAuthorName());
    }
}
