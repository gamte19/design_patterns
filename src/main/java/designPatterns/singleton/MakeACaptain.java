package designPatterns.singleton;

/**
 * Created by Mate on 2017. 05. 22..
 */
public class MakeACaptain {

    private static MakeACaptain _captain;

    private MakeACaptain() {}

    public static MakeACaptain getInstane() {
        if (_captain == null) {
            _captain = new MakeACaptain();
        }
        return _captain;
    }


}
