package mega;

public class Member {
    private String id;
    private String userName;  // 정보은닉.
    private Integer age;

    // public void initialize();
    // public void progress();
    // public void update();
    // public void delete();

    public String getId() { return id;}
    public void setId(String id) {this.id =id;}

    public String getUserName() { return userName;}
    public void setUserName(String userName) {this.userName =userName;}

    public Integer getAge(/*매개변수*/)
    {
        return age;
    }

    public void setAge(Integer age) {this.age =age;}


}
