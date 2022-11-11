package TestcaseA;

public class ObjectB {

    private ObjectA nodeA = null;
    private String name;

    String getName()
    {
        return this.name;
    }
    void setName(String name)
    {
        this.name= name;
    }

    public ObjectA getNode()
    {
        if(nodeA == null)
            nodeA = new ObjectA("A");
        return nodeA;
    }

    public ObjectB() {}

    public ObjectB(String name)   // 복사 생성자.
    {
        this.name = name;
    }


}

