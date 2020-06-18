package Service;

import Data.Institution;
import Data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {

    List<Teacher> teacherList = new ArrayList<>();

    public Teacher findByTeacherId(long id) {

        for (Teacher teacher :
                teacherList) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }

        return null;
    }

    public Teacher findByTeacherName(String name) {

        for (Teacher teacher :
                teacherList) {
            if (teacher.getName().equals(name)) {
                return teacher;
            }
        }

        return null;
    }

    public List<Teacher> findByStudentName(String studentName) {

        List<Teacher> teacherList = new ArrayList<>();
        for (Teacher teacher :
                teacherList) {
            for (Institution institution :
                    teacher.getInstitutionList()) {
                if (institution.getStudent().getName().equals(studentName)) {
                    teacherList.add(teacher);
                }

            }

        }

        return teacherList;

    }


    public List<Teacher> findByStudentId(Long studentId) {

        List<Teacher> teacherList = new ArrayList<>();
        for (Teacher teacher :
                teacherList) {
            for (Institution institution :
                    teacher.getInstitutionList()) {
                if (institution.getStudent().getId().equals(studentId)) {
                    teacherList.add(teacher);
                }

            }

        }

        return teacherList;
    }


    public void saveTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    public void updateTeacher(Teacher teacher){
        for (Teacher value:
             teacherList) {
            if(teacher.getId().equals(value.getId())){
                value.setInstitutionList(teacher.getInstitutionList());
                value.setJournal(teacher.getJournal());
                value.setName(teacher.getName());
            }
        }
    }

    public void deleteTeacher(long id) {
        teacherList.remove(id);
    }
}
