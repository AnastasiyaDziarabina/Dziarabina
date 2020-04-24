import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1_Data {

    private String[] name = new String[3];
    private String[] surname = new String[3];
    private String[] dateOfBirthday = new String[3];
    private int course[];
    List<String> stemp = new ArrayList<String>();
    List<String> students = new ArrayList<String>();

    public void setName(String[] temp) {
        this.name = temp;
    }

    public void setSurname(String[] temp) {
        this.surname = temp;
    }

    public void setDateOfBirthday(String[] temp) {
        this.dateOfBirthday = temp;
    }

    public int[] getCourse() {
        return course;
    }

    public void setCourse(int[] temp) {
        this.course = temp;
    }

    public List<String> getPrint() {
        for (int i = 0; i < 3; i++) {
            stemp.add(0, name[i]);
            stemp.add(1, surname[i]);
            stemp.add(2, dateOfBirthday[i]);
            String myString = stemp.stream().collect(Collectors.joining(", "));
            students.add(i, myString);
            stemp.clear();
        }
        return students;
    }
}