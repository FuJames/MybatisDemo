package api;

import model.Course;
import model.Student;
import model.Supervisor;

import java.util.List;
import java.util.Set;

/**
 * Author: qianzhong.fu @ DataYes
 * Date: 2014/11/3
 * Time: 17:18
 */
public interface StudentMapper {
    public void insertStudent(Student student);
    public void deleteStudent(int id);
    public void updateStudent(Student student);
    public Student selectById(int id);
    public Set<Student> selectFemaleStudents();
    public Supervisor selectSupervisorById(int id);
    public void saveStudentCourse(Student student,Course course);
}
