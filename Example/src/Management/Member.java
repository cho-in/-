package Management;

import javax.swing.*;

public class Member extends Parent {
    int age;        // is a

    String userName;

    Group group;  // has a 가지게 된것 상속이 아님.

    public Group getGroup() {return group;}

    public void setGroup(Group group) {this.group = group;}

    public int getAge() { return this.age;}
    public void setAge(int age) {this.age = age;}

    public String getUserName() {return userName;}
    public void setUserName(String userName) {this.userName = userName;}

}
