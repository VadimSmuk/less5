class Philosopher extends Thread {
    private int id;
    private Object leftFork;
    private Object rightFork;
    private int mealsEaten;

    public Philosopher(int id, Object leftFork, Object rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.mealsEaten = 0;
    }

    private void eat() {
        synchronized (leftFork) {
            synchronized (rightFork) {
                System.out.println("Philosopher " + id + " is eating");
                mealsEaten++;
            }
        }
    }

    @Override
    public void run() {
        while (mealsEaten < 3) {
            eat();
        }
    }
}
