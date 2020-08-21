
import java.util.concurrent.atomic.AtomicLong;

import static sun.awt.geom.Curve.next;

public class MyRandom {

    private final AtomicLong seed;

    private static final long multiplier = 0x5DEECE66DL;

    private static final long mask = (1L << 48) - 1;
    private static final double DOUBLE_UNIT = 0x1.0p-53;
    private static final AtomicLong seedUniquifier
            = new AtomicLong(8682522807148012L);

    public MyRandom() {
        this(seedUniquifier() ^ System.nanoTime());
    }
    public MyRandom(long seed) {
        if (getClass() == MyRandom.class)
            this.seed = new AtomicLong(initialScramble(seed));
        else {
            // subclass might have overriden setSeed
            this.seed = new AtomicLong();
            setSeed(seed);
        }
    }

    synchronized public void setSeed(long seed) {
        this.seed.set(initialScramble(seed));
        boolean haveNextNextGaussian = false;
    }

    private static long initialScramble(long seed) {
        return (seed ^ multiplier) & mask;
    }

    private static long seedUniquifier() {
        // L'Ecuyer, "Tables of Linear Congruential Generators of
        // Different Sizes and Good Lattice Structure", 1999
        for (;;) {
            long current = seedUniquifier.get();
            long next = current * 181783497276652981L;
            if (seedUniquifier.compareAndSet(current, next))
                return next;
        }
    }



    public double nextDouble() {
        return (((long)(next(26)) << 27) + next(27)) * DOUBLE_UNIT;
    }
}
