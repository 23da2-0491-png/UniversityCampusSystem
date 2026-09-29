import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static StudentLinkedList linkedList = new StudentLinkedList();
    static ActionStack actionStack = new ActionStack();
    static ServiceQueue serviceQueue = new ServiceQueue();
    static StudentBST bst = new StudentBST();
    static StudentHashTable hashTable = new StudentHashTable();
    static CampusGraph campusGraph = new CampusGraph();

    public static void main(String[] args) {

        while (true) {

            displayMenu();

            int choice = readInt("Enter your choice: ");

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    updateStudent();
                    break;

                case 3:
                    deleteStudent();
                    break;

                case 4:
                    linkedList.display();
                    break;

                case 5:
                    addServiceRequest();
                    break;

                case 6:
                    serviceQueue.processNext();
                    break;

                case 7:
                    actionStack.display();
                    break;

                case 8:
                    bst.displayInOrder();
                    break;

                case 9:
                    searchUsingHashing();
                    break;

                case 10:
                    addCampusLocation();
                    break;

                case 11:
                    removeCampusLocation();
                    break;

                case 12:
                    addCampusConnection();
                    break;

                case 13:
                    removeCampusConnection();
                    break;

                case 14:
                    campusGraph.displayConnections();
                    break;

                case 15:
                    traverseCampus();
                    break;

                case 16:
                    System.out.println("Program closed.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Enter 1-16.");
            }
        }
    }

    static void displayMenu() {

        System.out.println("\n==========================================");
        System.out.println(" UNIVERSITY STUDENT & CAMPUS SYSTEM");
        System.out.println("==========================================");
        System.out.println("1. Add Student Record");
        System.out.println("2. Update Student Record");
        System.out.println("3. Delete Student Record");
        System.out.println("4. Display All Records using Linked List");
        System.out.println("5. Add Service Request to Queue");
        System.out.println("6. Process Next Service Request");
        System.out.println("7. Display Recent Actions using Stack");
        System.out.println("8. Display Students using BST");
        System.out.println("9. Search Student using Hashing");
        System.out.println("10. Add Campus Location");
        System.out.println("11. Remove Campus Location");
        System.out.println("12. Add Campus Connection/Road");
        System.out.println("13. Remove Campus Connection/Road");
        System.out.println("14. Display Campus Connections");
        System.out.println("15. Traverse Campus using BFS/DFS");
        System.out.println("16. Exit");
        System.out.println("==========================================");
    }

    static void addStudent() {

        int id = readInt("Enter Student ID: ");

        if (linkedList.search(id) != null) {
            System.out.println("Student ID already exists.");
            return;
        }

        String name = readString("Enter Name: ");
        String programme = readString("Enter Programme: ");

        double marks = readMarks();

        Student student =
                new Student(id, name, programme, marks);

        linkedList.add(student);
        bst.insert(student);
        hashTable.add(student);

        actionStack.push("Added student " + id);

        System.out.println("Student added successfully.");
    }

    static void updateStudent() {

        int id = readInt("Enter Student ID to update: ");

        Student student = linkedList.search(id);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        String name = readString("Enter new name: ");
        String programme = readString("Enter new programme: ");
        double marks = readMarks();

        student.setName(name);
        student.setProgramme(programme);
        student.setMarks(marks);

        actionStack.push("Updated student " + id);

        System.out.println("Student updated successfully.");
    }

    static void deleteStudent() {

        int id = readInt("Enter Student ID to delete: ");

        Student student = linkedList.search(id);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        linkedList.delete(id);
        hashTable.delete(id);

        actionStack.push("Deleted student " + id);

        System.out.println("Student deleted from records.");
        System.out.println(
                "Note: BST record remains in this basic implementation.");
    }

    static void addServiceRequest() {

        int id = readInt("Enter Student ID: ");

        if (linkedList.search(id) == null) {
            System.out.println("Student not found.");
            return;
        }

        String request =
                readString("Enter service request: ");

        serviceQueue.addRequest(
                "Student " + id + " - " + request);

        actionStack.push(
                "Added service request for student " + id);
    }

    static void searchUsingHashing() {

        int id = readInt("Enter Student ID to search: ");

        Student student = hashTable.search(id);

        if (student == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println("Student found:");
            System.out.println(student);
        }
    }

    static void addCampusLocation() {

        String location =
                readString("Enter campus location: ");

        if (campusGraph.addLocation(location)) {
            System.out.println("Location added successfully.");
        } else {
            System.out.println("Location already exists.");
        }
    }

    static void removeCampusLocation() {

        String location =
                readString("Enter location to remove: ");

        if (campusGraph.removeLocation(location)) {
            System.out.println("Location removed successfully.");
        } else {
            System.out.println("Location not found.");
        }
    }

    static void addCampusConnection() {

        String location1 =
                readString("Enter first location: ");

        String location2 =
                readString("Enter second location: ");

        if (campusGraph.addConnection(location1, location2)) {
            System.out.println("Connection added successfully.");
        } else {
            System.out.println(
                    "Unable to add connection. Check locations or duplicate connection.");
        }
    }

    static void removeCampusConnection() {

        String location1 =
                readString("Enter first location: ");

        String location2 =
                readString("Enter second location: ");

        if (campusGraph.removeConnection(location1, location2)) {
            System.out.println("Connection removed successfully.");
        } else {
            System.out.println("Connection not found.");
        }
    }

    static void traverseCampus() {

        String start =
                readString("Enter starting location: ");

        System.out.println("1. BFS");
        System.out.println("2. DFS");

        int choice = readInt("Choose traversal: ");

        if (choice == 1) {
            campusGraph.bfs(start);
        } else if (choice == 2) {
            campusGraph.dfs(start);
        } else {
            System.out.println("Invalid traversal choice.");
        }
    }

    static int readInt(String message) {

        while (true) {

            try {

                System.out.print(message);

                return Integer.parseInt(
                        scanner.nextLine().trim());

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid input. Enter a number.");
            }
        }
    }

    static double readMarks() {

        while (true) {

            try {

                System.out.print("Enter Marks (0-100): ");

                double marks =
                        Double.parseDouble(
                                scanner.nextLine().trim());

                if (marks >= 0 && marks <= 100) {
                    return marks;
                }

                System.out.println(
                        "Marks must be between 0 and 100.");

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid marks. Enter a number.");
            }
        }
    }

    static String readString(String message) {

        while (true) {

            System.out.print(message);

            String value = scanner.nextLine().trim();

            if (!value.isEmpty()) {
                return value;
            }

            System.out.println(
                    "Input cannot be empty.");
        }
    }
}