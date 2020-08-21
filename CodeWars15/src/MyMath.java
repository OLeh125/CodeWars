import java.util.Random;

public class MyMath {

    private static final class RandomNumberGeneratorHolder {
        static final MyRandom randomNumberGenerator = new MyRandom();
    }

    public static double random() {
        return MyMath.RandomNumberGeneratorHolder.randomNumberGenerator.nextDouble();
    }
}
