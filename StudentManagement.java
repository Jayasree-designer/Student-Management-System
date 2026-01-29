import java.util.*;

// Student class
class Student {
    int id;
    String name;
    int marks;

    // Constructor
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

// Main class
public class StudentManagement {

    public static void main(String[] args) {

        // 1. Store students in ArrayList
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Yuva", 85));
        studentList.add(new Student(2, "Dhana", 90));
        studentList.add(new Student(3, "Kavi", 78));

        // 2. Use HashMap for fast lookup
        HashMap<Integer, Student> studentMap = new HashMap<>();
        for (Student s : studentList) {
            studentMap.put(s.id, s);
        }

        // 3. Remove duplicate IDs using Set
        Set<Integer> uniqueIds = new HashSet<>();
        for (Student s : studentList) {
            uniqueIds.add(s.id);
        }

        // 4. Sort students by marks using Comparator
        Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s2.marks - s1.marks; // descending order
            }
        });

        // 5. Print formatted report
        System.out.println("Student Report");
        System.out.println("ID   Name   Marks");
        System.out.println("-------------------");

        for (Student s : studentList) {
            System.out.println(s.id + "    " + s.name + "   " + s.marks);
        }

        // 6. Fast search using HashMap
        System.out.println("\nSearch Student with ID = 2");
        Student result = studentMap.get(2);
        System.out.println(result.id + " " + result.name + " " + result.marks);
    }
}