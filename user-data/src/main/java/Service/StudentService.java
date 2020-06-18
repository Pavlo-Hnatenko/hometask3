package Service;

import Data.Institution;
import Data.Student;
import Data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    List<Student> studentList = new ArrayList<Student>();

    public Student findByStudentId(long id) {

        for (Student student :
                studentList) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    public Student findByStudentName(String name) {

        for (Student student :
                studentList) {
            if (student.getName().equals(name)) {
                return student;
            }
        }

        return null;
    }

    public List<Student> findByTeacherName(String teacherName) {

        List<Student> list = new ArrayList<>();
        for (Student student :
                studentList) {
            for (Institution institution :
                    student.getInstitutionList()) {
                if (institution.getTeacher().getName().equals(teacherName)) {
                    list.add(student);
                }

            }

        }

        return list;

    }


    public List<Student> findByTeacherId(Long teacherId) {

        List<Student> list = new ArrayList<>();
        for (Student student :
                studentList) {
            for (Institution institution :
                    student.getInstitutionList()) {
                if (institution.getTeacher().getId().equals(teacherId)) {
                    list.add(student);
                }

            }

        }

        return list;
    }


    public void saveStudent(Student student) {
        studentList.add(student);
    }

    public void updateStudent(Student student){
        for (Student value:
                studentList) {
            if(student.getId().equals(value.getId())){
                value.setInstitutionList(student.getInstitutionList());
                value.setName(student.getName());
            }
        }
    }

    public void deleteStudent(long id) {
        studentList.removeIf(student -> student.getId().equals(id));
    }

    public List<Student> findAllStudent() {
        return studentList;
    }

}
