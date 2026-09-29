import java.util.HashMap;

public class StudentHashTable {

    private HashMap<Integer, Student> table = new HashMap<>();

    public boolean add(Student student) {

        if (table.containsKey(student.getStudentId())) {
            return false;
        }

        table.put(student.getStudentId(), student);
        return true;
    }

    public Student search(int studentId) {
        return table.get(studentId);
    }

    public boolean delete(int studentId) {
        return table.remove(studentId) != null;
    }
}