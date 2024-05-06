package fundamentals.collections;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

// Comparator implementation for sorting students in descending order of ID
class Desc implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        // Compare students by their IDs in descending order
        return Integer.compare(o2.getId(), o1.getId());
    }
}
public class StudentsCollectionRunner {
    public static void main(String[] args){
        // Creating an immutable list of students
        List<Student> students = List.of(
                new Student(1, "Sreehari"),
                new Student(2, "John"),
                new Student(3, "Jakes"),
                new Student(5, "Smith"),
                new Student(4, "Donald")
        );

        // Creating a mutable ArrayList from the immutable list
        List<Student> studentsAl = new ArrayList<>(students);

        // Print the initial order of students
        System.out.println("Initial Order: " + studentsAl);

        // Update operation
        int updateId = 3;
        String newName = "Jake";
        for (Student student : studentsAl) {
            if (student.getId() == updateId) {
                student.setName(newName);
                break;
            }
        }
        System.out.println("After Updating Jakes to Jake: " + studentsAl);

        //Delete Operation
        int deleteId = 4;
        for(Student student: studentsAl){
            if (student.getId() == deleteId) {
                studentsAl.remove(student);
                break;
            }
        }
         System.out.println("After Deleting 4 Donald: " + studentsAl);

        // Sorting students in ascending order based on natural ordering (ID)
        Collections.sort(studentsAl);
        System.out.println("Ascending Order: " + studentsAl);

        // Sorting students in descending order based on custom Comparator (Desc)
        studentsAl.sort(new Desc());
        System.out.println("Descending Order: " + studentsAl);
    }
}