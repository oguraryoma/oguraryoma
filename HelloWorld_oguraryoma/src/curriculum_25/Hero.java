package curriculum_25;

import java.util.Random;

public class Hero extends Player {

	private static final Random random = new Random();

	public Hero(String name) {
		super(j
				name,
				getRandom(500, 1000),
				getRandom(300, 900),
				getRandom(100, 500),
				getRandom(50, 300),
				getRandom(10, 200));
	}

	private static int getRandom(int min, int max) {
		return random.nextInt(max - min + 1) + min;
	}
}
