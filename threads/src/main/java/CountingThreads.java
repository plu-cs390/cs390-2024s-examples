/**
 * This example demonstrates how threads interleave their operations in a non-deterministic
 * way.
 */

public class CountingThreads {

    private static class Counter implements Runnable {
        @Override
        public void run() {
            for( int i = 0; i < 1000; i++ ) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Counter()).start();
        new Thread(new Counter()).start();
    }
}
