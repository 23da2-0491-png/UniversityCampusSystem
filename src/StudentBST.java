public class StudentBST {

    private class Node {
        Student student;
        Node left;
        Node right;

        Node(Student student) {
            this.student = student;
        }
    }

    private Node root;

    public boolean insert(Student student) {
        if (root == null) {
            root = new Node(student);
            return true;
        }

        return insertNode(root, student);
    }

    private boolean insertNode(Node node, Student student) {

        if (student.getStudentId() == node.student.getStudentId()) {
            return false;
        }

        if (student.getStudentId() < node.student.getStudentId()) {

            if (node.left == null) {
                node.left = new Node(student);
                return true;
            }

            return insertNode(node.left, student);

        } else {

            if (node.right == null) {
                node.right = new Node(student);
                return true;
            }

            return insertNode(node.right, student);
        }
    }

    public void displayInOrder() {

        if (root == null) {
            System.out.println("BST is empty.");
            return;
        }

        System.out.println("\nStudents using BST:");

        inOrder(root);
    }

    private void inOrder(Node node) {

        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.println(node.student);
        inOrder(node.right);
    }
}