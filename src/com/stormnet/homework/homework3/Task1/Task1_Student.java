import java.util.ArrayList;
import java.util.List;

public class Task1_Student {

    private static String[] name = {"Вася", "Петя", "Толик"};
    private static String[] surname = {"Иванов", "Петров", "Сидоров"};
    private static String[] dateOfBirthday = {"30.05.2001", "04.04.2001", "15.07.2001"};
    private static int[] course = {2, 2, 1};
    private static Task1_Data Students = new Task1_Data();

    public static void main(String[] args) {
        set();
        printStudents(get(), getCourse());
    }

    public static void set() {
        Students.setName(name);
        Students.setSurname(surname);
        Students.setDateOfBirthday(dateOfBirthday);
        Students.setCourse(course);

    }

    public static ArrayList<String> get() {
        return (ArrayList<String>) Students.getPrint();
    }

    public static int[] getCourse() {
        return Students.getCourse();
    }

    public static void printStudents(List students, int[] getCourse) {
        int c = 0;
        for (Object i : students) {

            System.out.printf("%s\t%d%n", i, getCourse[c]);
            c++;
        }
    }
}

