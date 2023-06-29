public class Main {
    public static void main(String[] args) {
        JvmComprehension demoObject = new JvmComprehension();
        ClassLoader applicationClassLoader = demoObject.getClass().getClassLoader();
        printClassLoaderDetails(applicationClassLoader);

        Object o = new Object();
        ClassLoader ObjectClassLoader = o.getClass().getClassLoader();
        printClassLoaderDetails(ObjectClassLoader);

    }

    private static void printClassLoaderDetails(ClassLoader classLoader) {
        // bootstrap classloader is represented by null in JVM
        if (classLoader != null) {
            System.out.println("ClassLoader name : " + classLoader.getName());
            System.out.println("ClassLoader class : " + classLoader.getClass().getName());
        } else {
            System.out.println("Bootstrap classloader");
        }
    }

}