package mega;

// 패키지 내부 클래스를 1개씩 불러올 경우.
// import mega.example.test.MegaExampleTest;

// 패키지 내부 클래스를 모두 불러올 경우.
// import mega.example.test.*;

import mega.example.test.Singleton;

public class MegaExample {
    // MegaExampleTest test;

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

