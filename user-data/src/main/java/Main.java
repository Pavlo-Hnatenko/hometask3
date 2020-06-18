import Data.Institution;
import Security.Authorization;
import Data.Student;
import Data.Teacher;
import Data.User;
import Service.StudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        Student student1 = new Student("Ivan");
        Student student2 = new Student("Ivanka");
        Student student3 = new Student("Disaster");
        Teacher teacher4 = new Teacher("Petro Petrovych");
        Teacher teacher5 = new Teacher("Lyudmula Stepanivna");

        users.add(student1);
        users.add(student2);
        users.add(student3);
        users.add(teacher4);
        users.add(teacher5);

        System.out.println("It's a sign in of all users...");
        for (User user:
             users) {
            Authorization.signIn(user);
        }
        System.out.println();

        System.out.println("Creating a list of students...");

        StudentService studentService = new StudentService();

        studentService.saveStudent(student1);
        studentService.saveStudent(student2);
        studentService.saveStudent(student3);

        System.out.println("The size of our list of students is: " + studentService.findAllStudent().size());

        for (Student student:
                studentService.findAllStudent()) {

            System.out.println("Student name: " + student.getName() + ", student id is: " + student.getId());
        }
        System.out.println();

        System.out.println("Checking search of students by teacher...");

        List<Institution> institutionList1 = new ArrayList<>();
        Institution institution1 = new Institution(student1, teacher4);
        Institution institution2 = new Institution(student1, teacher5);
        institutionList1.add(institution1);
        institutionList1.add(institution2);
        student1.setInstitutionList(institutionList1);

        List<Institution> institutionList2 = new ArrayList<>();
        Institution institution3 = new Institution(student2, teacher4);
        institutionList2.add(institution3);
        student2.setInstitutionList(institutionList2);

        List<Institution> institutionList3 = new ArrayList<>();
        Institution institution4 = new Institution(student3, teacher5);
        Institution institution5 = new Institution(student3, teacher4);
        institutionList3.add(institution4);
        institutionList3.add(institution5);
        student3.setInstitutionList(institutionList3);

        System.out.print("Creating list of students of the teacher with id " + teacher4.getId() + ": ");
        for (Student student:
                studentService.findByTeacherId(teacher4.getId())) {
            System.out.print(student.getName() + "; ");
        }
        System.out.println();
        System.out.print("Creating list of students of the teacher with name " + teacher5.getName() + ": ");
        for (Student student:
                studentService.findByTeacherName(teacher5.getName())) {
            System.out.print(student.getName() + "; ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Checking updating and removal...");
        System.out.println("Name of the student3 before updating: " + studentService.findByStudentId(3).getName());
        student3.setName("Updated student");
        studentService.updateStudent(student3);
        System.out.println("Name of the student3 after updating: " + studentService.findByStudentId(3).getName());
        System.out.println("Size of our students list before removal is: " + studentService.findAllStudent().size());
        System.out.println("Removal the student with id: " + student1.getId());
        studentService.deleteStudent(student1.getId());
        System.out.println("Size of our students list after removal is: " + studentService.findAllStudent().size());
        System.out.println();












    }
}
