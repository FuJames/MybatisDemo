package api;

import model.Student;

import java.util.List;

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
    public List<Student> selectFemaleStudents();
}
