package model;

/**
 * Author: qianzhong.fu @ DataYes
 * Date: 2014/11/4
 * Time: 14:38
 */
public class Course {
    private int id;
    private String name;
    private int credit;
    private int type;

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

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
