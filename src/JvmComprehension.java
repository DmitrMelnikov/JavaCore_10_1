public class JvmComprehension {

    public static void main(String[] args)  {
        // при запуске main  используеться Application ClassLoader
        // для класса JvmComprehension
        // в момент вызова main создаеться фрейм с Stack Memory

        // добавляеться переменная i в Stack Memory
        int i = 1;                      // 1
        // при создании new Object() используеться Bootstrap classloader для
        // класса Object
        // Object помещаеться в heap (куча)
        // в Stack Memory отправляеться ссылка на Object
        Object o = new Object();        // 2
        // Integer помещаеться в heap (куча)
        // добавляеться переменная ii в Stack Memory
        // с ссылкой на  Integer в  heap (куча)
        Integer ii = 2;                 // 3
        // в момент вызова printAll создаеться фрейм с Stack Memory
        // параметр o указывает на обьект Object  в heap (куча)
        // параметр i ссылаеться на переменую i
        // параметр ii ссылаеться на переменую ii
        printAll(o, i, ii);             // 4
        // создаеться новый фрейм для вывода строки "finished"
        System.out.println("finished"); // 7
    }

    private static void printAll(Object o, int i, Integer ii) {
        // создаеться переменая uselessVar сылающаяся на класс Integer в куче
        Integer uselessVar = 700;                   // 5
        // создаеться новый фрейм для вывода комбинации по параметрам
        // параметр o указывает на обьект Object()  в heap (куча)
        // параметр i ссылаеться на переменую i
        // параметр ii ссылаеться на переменую ii
        System.out.println(o.toString() + i + ii);  // 6
    }


}