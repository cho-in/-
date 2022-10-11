package mega;

import mega.example.test.Singleton;

public class MegaExample {
    /*
    Singleton s1 = new Singleton();
    Singleton s2 = new Singleton();
    Singleton s3 = new Singleton();
 */
    public static void main(String[] args)
    {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
    }
}

