import model.Course;
import model.Student;
import service.StudentService;

import java.util.Set;

/**
 * Author: qianzhong.fu @ DataYes
 * Date: 2014/10/28
 * Time: 9:35
 */
public class Main {
    private static StudentService service = new StudentService();
    public static void main(String args[]){
        Student student = getStudentById();
        System.out.println("123");
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
        Student stu = service.getStudentById(797);
        return stu;
    }
    public static Set<Student> getFemaleStudents(){
        Set<Student> students = service.getFemaleStudents();
        return students;
    }
    public static void saveStudentCourse(){
        Student s = new Student();
        Course c = new Course();
        s.setId(797);
        c.setId(2);
        service.saveStudentCourse(s, c);
    }


}
