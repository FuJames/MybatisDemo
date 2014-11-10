package service;

import api.StudentMapper;
import model.Course;
import model.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import util.MybatisUtil;

import java.util.List;
import java.util.Set;

/**
 * Author: qianzhong.fu @ DataYes
 * Date: 2014/11/3
 * Time: 17:18
 */
public class StudentService {
    private static final SqlSessionFactory factory = MybatisUtil.getSqlSessionFactory();

    public void insertStudent(Student student){
        SqlSession sqlSession = factory.openSession();
        try{
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            mapper.insertStudent(student);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
    }
    public void deleteStudent(int id){
        SqlSession sqlSession = factory.openSession();
        try{
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            mapper.deleteStudent(id);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
    }
    public void updateName(String name,int id){
        Student stu = getStudentById(id);
        stu.setName(name);
        updateStudent(stu);
    }
    private void updateStudent(Student student){
        SqlSession sqlSession = factory.openSession();
        try{
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            mapper.updateStudent(student);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
    }
    public Student getStudentById(int id){
        SqlSession sqlSession = factory.openSession();
        try{
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            return mapper.selectById(id);
        }finally {
            sqlSession.close();
        }
    }
    public Set<Student> getFemaleStudents(){
        SqlSession sqlSession = factory.openSession();
        try{
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            return mapper.selectFemaleStudents();
        }finally {
            sqlSession.close();
        }
    }
    public void saveStudentCourse(Student student,Course course){
        SqlSession sqlSession = factory.openSession();
        try{
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            mapper.saveStudentCourse(student,course);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
    }

}
