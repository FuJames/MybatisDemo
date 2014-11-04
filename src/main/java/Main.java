import model.Student;
import service.StudentService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Author: qianzhong.fu @ DataYes
 * Date: 2014/10/28
 * Time: 9:35
 */
public class Main {
    private static StudentService service = new StudentService();
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setId(1);
        s2.setId(1);
        Set<Student> students = new HashSet<Student>();
        students.add(s1);
        students.add(s2);
        System.out.println(students.size());
    }
    public static void insertStudents(){
        for(int i = 1; i < 100 ; i++){
            Student student = new Student();
            student.setName("test "+i);
            student.setGrade("2012");
            student.setMajor("Computer Science");
            if(i%2==0)
                student.setSex("f");
            else
                student.setSex("m");
            service.insertStudent(student);
        }
    }
    public static void deleteStudent(){
        service.deleteStudent(795);
    }
    public static void updateName(){
        service.updateName("test3修改", 796);
    }
    public static Student getStudentById(){
        Student stu = service.getStudentById(796);
        return stu;
    }
    public static List<Student> getFemaleStudents(){
        List<Student> students = service.getFemaleStudents();
        return students;
    }
}
