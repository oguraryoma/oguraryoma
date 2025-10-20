package curriculum_25;

import java.util.Random;

public class Hero extends Player {
    public Hero(String name) {
        super(
            name,
            getRandom(500, 1000),
            getRandom(300, 900),
            getRandom(100, 500),
            getRandom(100, 1000),
            getRandom(10, 200)
        );
    }

    private static int getRandom(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }
}
