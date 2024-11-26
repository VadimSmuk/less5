public class main {
    public static void main(String[] args) {
        Object[] forks = new Object[5];
        Philosopher[] philosophers = new Philosopher[5];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < philosophers.length; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % forks.length];
            philosophers[i] = new Philosopher(i, leftFork, rightFork);
        }

        for (Philosopher philosopher : philosophers) {
            philosopher.start();
        }
    }
}