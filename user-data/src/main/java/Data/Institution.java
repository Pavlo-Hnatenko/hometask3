package Data;

import java.util.List;

public class Institution {

    private Student student;
    private Teacher teacher;

    public Institution(Student student, Teacher teacher){
        this.student = student;
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
