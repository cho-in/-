package TestcaseA;

public class Object {

    Object node;

    Object getNode() { return node;}

    Object setNode(Object node) {this.node = node; return this;}

    private String name;
    private int age;

    String getName() {return this.name;}
    Object setName(String name) {this.name =name; return this;}

    Object setAge(int age) {this.age = age; return this;}
}
