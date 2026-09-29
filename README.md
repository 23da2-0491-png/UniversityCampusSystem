# University Student Record and Campus Route Management System

## CIT300 – Data Structures and Algorithms

### Graded Practical Assignment 1 – Week 10

A Java-based **group project** developed to demonstrate the practical application of data structures and algorithms in a university student record and campus route management system.

## 1. Project Overview

The **University Student Record and Campus Route Management System** is a console-based Java application designed to manage university student records, student service requests, and campus locations.

The project demonstrates the use of the following data structures:

* Linked List
* Stack
* Queue
* Binary Search Tree (BST)
* Hashing
* Graph
* Breadth-First Search (BFS)
* Depth-First Search (DFS)

The system provides a menu-driven interface that allows users to perform student management operations, manage service requests, and manage campus locations and connections.

## 2. Project Objectives

The main objectives of this project are:

1. To apply data structures to a real-world university management scenario.
2. To manage student records efficiently.
3. To implement a Linked List for student records.
4. To implement a Stack for recent system actions.
5. To implement a Queue for student service requests.
6. To implement a Binary Search Tree for student records.
7. To implement Hashing for efficient Student ID searching.
8. To implement a Graph for campus locations and connections.
9. To implement BFS and DFS graph traversal algorithms.
10. To demonstrate input validation and error handling.
11. To demonstrate teamwork and GitHub-based collaboration.

# 3. Technologies Used

* **Programming Language:** Java
* **IDE:** Visual Studio Code
* **Version Control:** Git
* **Repository:** GitHub
* **Data Storage:** In-memory data structures
* **Graph Representation:** Adjacency List

# 4. Data Structures and Algorithms

## 4.1 Linked List

A Linked List is used to manage student records.

### File

```text
StudentLinkedList.java
```

### Operations

* Add Student
* Search Student
* Delete Student
* Display All Students

The Linked List allows student records to be dynamically stored and managed.

## 4.2 Stack

A Stack is used to store recent system actions.

### File

```text
ActionStack.java
```

The Stack follows the:

```text
LIFO – Last In, First Out
```

principle.

### Example Actions

```text
Student Added
Student Updated
Student Deleted
Service Request Processed
```

## 4.3 Queue

A Queue is used to manage student service requests.

### File

```text
ServiceQueue.java
```

The Queue follows the:

```text
FIFO – First In, First Out
```

principle.

### Operations

* Add Service Request
* Process Next Request
* Display Requests

## 4.4 Binary Search Tree

A Binary Search Tree is used to organize student records based on Student ID.

### File

```text
StudentBST.java
```

Student IDs are used as keys in the tree.

The project uses in-order traversal to display student records in sorted order.

## 4.5 Hashing

Hashing is used for efficient searching of students using Student ID.

### File

```text
StudentHashTable.java
```

The Student ID is used as the key to locate student records.

### Operations

* Add Student
* Search Student
* Delete Student

## 4.6 Graph

A Graph is used to represent campus locations and their connections.

### File

```text
CampusGraph.java
```

The graph is implemented using an **Adjacency List**.

### Graph Operations

* Add Campus Location
* Remove Campus Location
* Add Campus Connection
* Remove Campus Connection
* Display Campus Connections
* BFS Traversal
* DFS Traversal

# 5. BFS and DFS

## Breadth-First Search

BFS visits connected campus locations level by level.

Example:

```text
Library
   |
Main Hall
   |
Cafeteria
   |
Laboratory
```

BFS can be used to explore the campus network starting from a selected location.

## Depth-First Search

DFS explores a path deeply before moving to another available path.

The system allows users to select a starting campus location and perform DFS traversal.


# 6. System Features

The application provides the following menu:

```text
================================================
 UNIVERSITY STUDENT & CAMPUS MANAGEMENT SYSTEM
================================================

1. Add Student
2. Update Student
3. Delete Student
4. Display All Student Records
5. Add Service Request
6. Process Next Service Request
7. Display Recent Actions
8. Display Students using BST
9. Search Student using Hashing
10. Add Campus Location
11. Remove Campus Location
12. Add Campus Connection
13. Remove Campus Connection
14. Display Campus Connections
15. Traverse Campus using BFS/DFS
16. Exit
```

# 7. Student Record

Each student record contains:

```text
Student ID
Student Name
Programme
Marks
```

Example:

```text
Student ID : 101
Name       : Aara Dhilfar
Programe  : Software  Engennering
Marks      : 90
```
# 8. Project Structure

```text
UniversityCampusSystem/
│
├── src/
│   ├── Main.java
│   ├── Student.java
│   ├── StudentLinkedList.java
│   ├── ActionStack.java
│   ├── ServiceQueue.java
│   ├── StudentBST.java
│   ├── StudentHashTable.java
│   └── CampusGraph.java
│
├── out/
│
├── .gitignore
│
└── README.md
```

The `out/` folder contains compiled Java files and is excluded from Git using `.gitignore`.

# 9. How to Run the Project

## Step 1 – Clone the Repository

Clone the GitHub repository:

```powershell
git clone https://github.com/YOUR-USERNAME/UniversityCampusSystem.git
```

Then enter the project:

```powershell
cd UniversityCampusSystem
```

## Step 2 – Open in Visual Studio Code

*Open the project folder in Visual Studio Code.*

```text
UniversityCampusSystem
```

---

## *Step 3 – Compile the Project*

*Open the VS Code terminal and run:*

```powershell
javac -d out src\*.java
```

## *Step 4 – Run the Application*

```powershell
java -cp out Main
```

*The main menu will appear in the terminal.*

# *10. Input Validation*

*The system includes validation for different types of invalid input.*

### *Student Validation*

* *Student ID must not be duplicated.*
* *Student ID must be valid.*
* *Student name must be entered.*
* *Programme must be entered.*
* *Marks must be between 0 and 100.*

### *Campus Validation*

* *Campus location names must not be duplicated.*
* *Connections must use existing locations.*
* *Duplicate connections are prevented.*
* *Non-existing locations cannot be removed.*

### *Menu Validation*

*Invalid menu selections are handled and the user is asked to enter a valid option.*

# *11. Error Handling*

*The system handles common errors such as:*

* *Duplicate Student ID*
* *Student not found*
* *Invalid marks*
* *Invalid menu option*
* *Empty Queue*
* *Duplicate campus location*
* *Campus location not found*
* *Invalid campus connection*
* *Duplicate campus connection*
* *Invalid BFS/DFS starting location*

# *12. Group Members*

| *No.* | *Student Name* | *Student ID* | *Assigned Responsibility*          |
| ----- | -------------- | ------------ | ---------------------------------- |
| *1*   | *MMA. DHILFAR* | *23DA2-0491* | *Student Management / Linked List* |
| *2*   | *F.Fathima*     | *23DA2-1169* | *Stack / Queue*                    |
| *3*   | *NF.Sahara*     | *23DA2-1009* | *BST / Hashing*                    |
| *4*   | *USMS. Falah*     | *23DA2-0740* | *Graph / BFS / DFS*                |

> *Replace Member 2, Member 3, and Member 4 with the actual group member names and Student IDs.*

# *13. Group Responsibilities*

## *Member 1 – Student Management*

*Responsibilities:*

* *Student class*
* *Linked List implementation*
* *Add student*
* *Update student*
* *Delete student*
* *Display student records*
* *Student validation*

---

## *Member 2 – Stack and Queue*

*Responsibilities:*

* *Stack implementation*
* *Recent action management*
* *Queue implementation*
* *Student service requests*
* *Queue validation and testing*
* 
## *Member 3 – BST and Hashing*

*Responsibilities:*

* *Binary Search Tree implementation*
* *Student ID-based BST operations*
* *Hashing implementation*
* *Student searching*
* *BST and Hashing testing*

## *Member 4 – Graph*

*Responsibilities:*

* *Campus Graph implementation*
* *Add/remove campus locations*
* *Add/remove campus connections*
* *Display campus network*
* *BFS implementation*
* *DFS implementation*
* *Graph testing*
  
# *14. Integration and Testing*

*All group members contribute to the integration and testing of the complete application.*

*Testing includes:*

### *Student Management*

* *Add valid student*
* *Add duplicate student*
* *Update student*
* *Delete student*
* *Search student*
* *Display students*

### *Stack*

* *Add actions*
* *Display recent actions*
* *Test empty stack*

### *Queue*

* *Add service request*
* *Process request*
* *Display requests*
* *Test empty queue*

### *BST*

* *Insert students*
* *Display students in sorted order*
* *Test student IDs*

### *Hashing*

* *Search existing Student ID*
* *Search non-existing Student ID*
* *Delete student*

### *Graph*

* *Add campus location*
* *Remove campus location*
* *Add connection*
* *Remove connection*
* *Display connections*
* *BFS traversal*
* *DFS traversal*

# *15. GitHub Collaboration*

*GitHub is used for source code management and collaboration.*

*The project is divided into separate components so that group members can contribute independently.*

### *Git Workflow*

*Each member can:*

```text
1. Pull the latest project
2. Work on the assigned component
3. Test the changes
4. Commit the changes
5. Push the changes to GitHub
```

*Example:*

```powershell
git add src\Student.java
git commit -m "Add Student class"
git push
```

# *16. Commit History*

*The repository contains separate commits for the development of different components.*

*Example commit messages:*

```text
Add gitignore configuration
Add Student class
Implement student linked list
Implement action stack
Implement service queue
Implement student BST
Implement student hashing
Implement campus graph
Integrate main menu and system
Add project README documentation
```

# *17. Contribution Evidence*

*GitHub commit history is used to demonstrate individual contributions.*

*Each group member should make commits related to their assigned responsibilities.*

*Examples:*

```text
Member 1 → Student Management / Linked List
Member 2 → Stack / Queue
Member 3 → BST / Hashing
Member 4 → Graph / BFS / DFS
```

*The final repository contains the integrated work of all group members.*

---

# *18. Testing Environment*

*The project was developed and tested using:*

```text
Operating System : Windows
Programming Language : Java
IDE : Visual Studio Code
Version Control : Git
Repository : GitHub
```

# *19. Learning Outcomes*

*Through this project, the group demonstrates understanding of:*

* *Linear Data Structures*
* *Linked Lists*
* *Stacks*
* *Queues*
* *Trees*
* *Binary Search Trees*
* *Hashing*
* *Graphs*
* *Adjacency Lists*
* *BFS*
* *DFS*
* *Searching*
* *Data management*
* *Input validation*
* *Git and GitHub collaboration*

---

# *20. Conclusion*

*The **University Student Record and Campus Route Management System** demonstrates how different data structures and algorithms can be combined to develop a practical university management application.*

*The system manages student records, service requests, and campus networks while demonstrating the use of Linked Lists, Stacks, Queues, Binary Search Trees, Hashing, Graphs, BFS, and DFS.*

*The project also demonstrates collaborative software development through Git and GitHub.*

## *Academic Information*

***Module:** CIT300 – Data Structures and Algorithms*

***Assignment:** Graded Practical Assignment 1 – Week 10*

***Project:** University Student Record and Campus Route Management System*

***Project Type:** Group Assignment*

***Institution:** SLTC Research University*

***Academic Year:** 2026*
