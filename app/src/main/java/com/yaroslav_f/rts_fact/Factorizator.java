package com.yaroslav_f.rts_fact;

class Factorizator {
    Long tsLong;
    long[] factor(long N) {
        tsLong = System.currentTimeMillis();
        long a = (long) Math.ceil(Math.sqrt(N));
        long b2 = a * a - N;
        while (!isSquare(b2)) {
            a++;
            b2 = a * a - N;
        }
        long r1 = a - (long)Math.sqrt(b2);
        long r2 = N / r1;

        return new long[]{r1, r2, System.currentTimeMillis() - tsLong};
    }

    /** function to check if N is a perfect square or not **/
    private boolean isSquare(long N) {
        long sqr = (long) Math.sqrt(N);
        return sqr * sqr == N || (sqr + 1) * (sqr + 1) == N;
    }
}
