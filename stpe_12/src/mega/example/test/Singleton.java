package mega.example.test;

public class Singleton
{
    private static Singleton instance = new Singleton();
    public static Singleton getInstance() { return instance;}

    private Singleton() { }   // 생성자




}
