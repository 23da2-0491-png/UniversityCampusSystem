public class StudentLinkedList {

    private class Node {
        Student student;
        Node next;

        Node(Student student) {
            this.student = student;
        }
    }

    private Node head;

    public void add(Student student) {

        Node newNode = new Node(student);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public Student search(int studentId) {

        Node current = head;

        while (current != null) {

            if (current.student.getStudentId() == studentId) {
                return current.student;
            }

            current = current.next;
        }

        return null;
    }

    public boolean delete(int studentId) {

        if (head == null) {
            return false;
        }

        if (head.student.getStudentId() == studentId) {
            head = head.next;
            return true;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.student.getStudentId() == studentId) {
                current.next = current.next.next;
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public void display() {

        if (head == null) {
            System.out.println("No student records found.");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.println(current.student);
            current = current.next;
        }
    }
}