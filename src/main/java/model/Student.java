package model;

import java.util.Date;
import java.util.Set;

/**
 * Author: qianzhong.fu @ DataYes
 * Date: 2014/11/3
 * Time: 17:09
 * 学生可以修多个课程
 */
public class Student {

    private int id;
    private String name;
    private String sex;
    private String major;
    private String grade;
    private Date createTime;
    private Date updateTime;
    private Set<Course> courses;

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj instanceof Student){
            Student student = (Student)obj;
            return student.getId() == this.id;
        }
        return false;
    }

    /**
     * 保证id相同的Student对象返回相同的hashCode。
     * @return
     */
    @Override
    public int hashCode(){
        return id;
    }
}
