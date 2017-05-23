package designPatterns.singleton;

/**
 * Created by Mate on 2017. 05. 22..
 */
public class SingletonExample {
    public static void main(String[] args) {
        MakeACaptain makeACaptain = MakeACaptain.getInstane();
        MakeACaptain makeACaptain1 = MakeACaptain.getInstane();

        System.out.println(makeACaptain == makeACaptain1);
    }

}
