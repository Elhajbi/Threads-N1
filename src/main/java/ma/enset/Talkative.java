package ma.enset;

public class Talkative implements Runnable {
    private int number;

    // Étape 1 : Constructor avec un entier
    public Talkative(int number) {
        this.number = number;
    }

    // Étape 3 : Redéfinir la méthode run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread " + number + " - Message " + i);
        }
    }
}
